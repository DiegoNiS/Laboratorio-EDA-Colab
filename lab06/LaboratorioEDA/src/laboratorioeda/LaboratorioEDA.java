package laboratorioeda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

public class LaboratorioEDA extends JFrame {

    private final int ANCHO = 700;
    private final int LARGO = 500;
    private JPanel panel;
    private JPanel subpanel1;
    private JPanel subpanel2;
    private String[] arregloStrings;
    JLabel mssg;
    JTextArea texto;
    String cadena = """
                      Lorem ipsum dolor sit amet consectetur adipisicing elit Cupiditate officiis repudiandae eum fuga ut assumenda ad Inventore dolorum dicta illo officiis porro quia deserunt saepe ullam animi ab Eaque dolorum Maxime nisi lorem voluptatibus ex est ipsam quisquam quibusdam nesciunt ea blanditiis maiores tempora doloremque harum A adipisci laboriosam laudantium reprehenderit molestiae amet saepe ipsum quod et autem fuga ipsa minima expedita! Dignissimos lorem necessitatibus quae velit pariatur esse impedit itaque eaque illo molestiae eos suscipit nam maiores facilis molestias
                      """;
    JTextField reemplazate;
    JButton reemplazar;
    JTextField buscarcontext;
    private TrieTree trie;

    public LaboratorioEDA() {
        setSize(ANCHO, LARGO);
        panel = new JPanel();
        subpanel1 = new JPanel();
        subpanel2 = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        subpanel1.setLayout(new BoxLayout(subpanel1, BoxLayout.Y_AXIS));
        subpanel2.setLayout(new BoxLayout(subpanel2, BoxLayout.Y_AXIS));

        int margin = 20;
        subpanel1.setBorder(new EmptyBorder(margin, margin, margin, 0));
        subpanel2.setBorder(new EmptyBorder(margin, margin, margin, margin));

        panel.add(subpanel1);
        panel.add(subpanel2);
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Trie");

        contents();

        setVisible(true);

        trie = new TrieTree(new TNode(' '));
        countall();
    }

    private void countall() {
        arregloStrings = texto.getText().split(" ");
        for (int i = 0; i < arregloStrings.length; i++) {
            trie.add(arregloStrings[i].toLowerCase(), i);
        }

        camposreemplazar();
    }

    private void camposreemplazar() {
        boolean noHayBusqueda = !buscarcontext.getText().equals("");
        reemplazate.setEnabled(noHayBusqueda);
        reemplazar.setEnabled(noHayBusqueda);
    }

    private void changecolor(LinkedList<Integer> colorPositions) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        LNode<Integer> firstE = colorPositions.getHead();
        for (int i = 0; i < arregloStrings.length; i++) {
            String word = arregloStrings[i];
            if (firstE != null && i == firstE.getData()) {
                sb.append("<font color=\"red\">").append(word).append("</font> ");
                firstE = firstE.getNext();
            } else {
                sb.append(word).append(" ");
            }
        }
        sb.append("</html>");
        String text = sb.toString();
        texto.setText(text);
    }

    private void contents() {
        texto = new JTextArea(10, 60);
        texto.setText(cadena);

        texto.setLineWrap(true);

        texto.setEditable(false);
        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);
        JLabel label1 = new JLabel("Palabras a buscar                        ");
        buscarcontext = new JTextField();
        JButton buscar = new JButton("Buscar");
        JLabel label2 = new JLabel("Reemplazar por");
        reemplazate = new JTextField();
        reemplazar = new JButton("reemplazar");
        mssg = new JLabel("No se encontraron resultados");
        mssg.setVisible(false);
        subpanel1.add(texto);
        subpanel2.add(label1);
        subpanel2.add(buscarcontext);
        subpanel2.add(buscar);
        subpanel2.add(label2);
        subpanel2.add(reemplazate);
        subpanel2.add(reemplazar);
        subpanel2.add(mssg);

        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (buscarcontext.getText().equals("")) {
                    texto.setText(cadena);
                    mssg.setVisible(false);
                } else {
                    TNode<Integer> bqt = trie.search(buscarcontext.getText().toLowerCase());
                    if (bqt != null) {
                        System.out.println(bqt);
                        camposreemplazar();
                        System.out.println(bqt.getPositions());
                        changecolor(bqt.getPositions());
                        mssg.setVisible(false);
                    } else {
                        mssg.setVisible(true);
                    }
                }
            }
        });

        reemplazar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TNode<Integer> bqt = trie.search(buscarcontext.getText().toLowerCase());
                if (bqt != null) {
                    trie.replace(buscarcontext.getText(), reemplazate.getText(), arregloStrings);
                    System.out.println(bqt);
                    camposreemplazar();
                    System.out.println(bqt.getPositions());
                    changecolor(bqt.getPositions());
                    mssg.setVisible(false);
                }
                
            }
        });
    }

    public static void main(String[] args) {
        new LaboratorioEDA();
    }

}
