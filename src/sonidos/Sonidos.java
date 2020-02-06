package sonidos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.io.*;
import java.net.InetAddress;
import javafx.scene.effect.DropShadow;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import sun.audio.*;

public class Sonidos extends JFrame implements ActionListener {

    JFrame colo = new JFrame();
    JFrame granja = new JFrame();
    JFrame cuerpo = new JFrame();
    JFrame jungla = new JFrame();
    JFrame planetas = new JFrame();
    JFrame comidas = new JFrame();
    JFrame numeros = new JFrame();
    JFrame vocales=new JFrame();
    String[] colores = {"Black-Negro", "Purple-Morado", "Cyan-Cyan", "Navy blue-Azul Marino", "Green-Verde", "Yellow-Amarillo", "Magenta-Magenta", "Red-Rojo", "Pink-Rosa", "Brown-Cafe", "Turquoise-Turquesa", "Orange-Naranja"};
    String[] animales = {"Donkey-Burro", "Horse-Caballo", "Pig-Cerdo", "Chicken-Gallo", "Cat-Gato", "Lion-Leon", "Wolf-Lobo", "Monkey-Mono", "Dog-Perro", "Frog-Rana", "Tiger-Tigre", "Cow-Vaca"};
    String[] jani = {"Bee-Abeja", "Spider-Araña", "Cobra-Cobra", "Crocodile-Cocodrilo", "Elephant-Elefante", "Iguana-Iguana", "Giraffe-Jirafa", "Parrot-Perico", "Monkey-Mono", "Bear-Oso", "Snake-Serpiente", "Tiger-Tigre"};
    String[] planet = {"Sun-Sol", "Mercury-Mercurio", "Venus-Venus", "Earth-Tierra", "Mars-Marte", "Jupiter-Jupiter", "Saturn-Saturno", "Uranus-Urano", "Neptune-Neptuno", "Pluto-Pluton"};
    String[] food = {"Meatballs-Albondigas", "Clam-Almejas", "Meat-Carne", "Soup-Sopa", "Hamburger-Hamburguesa", "Cake-Pastel", "Pizza-Pizza", "Chicken-Pollo", "Cheese-Queso", "Ravioli-Ravioli", "Spaghetti-Spaghetti", "Sushi-Sushi"};
    String[] numb = {"Zero-Cero", "One-Uno", "Two-Dos", "Three-Tres", "Four-Cuatro", "Five-Cinco", "Six-Seis", "Seven-Siete", "Eight-Ocho", "Nine-Nueve"};
    String[] vowels={"A","E","I","O","U"};
    JPanel pan, pana, pan1, pan2, pan3, pan4, pan5, pan6, pan7, pan8, pan0,pan9;
    JButton[][] bot = new JButton[4][3];
    boolean label;
    String col = null;
    JLabel lab, principa;
    JButton c, g, a, j, p, f, n,v;
    JButton[][] animal = new JButton[4][3];
    JButton[] pb = new JButton[11];
    JButton[] aj = new JButton[12];
    JButton[] pla = new JButton[10];
    JButton[] comi = new JButton[12];
    JButton[] num = new JButton[10];
    JButton[]voc=new JButton[5];
    Toolkit tk = getToolkit();
    Dimension dim = tk.getScreenSize();
    JMenuBar mb, mb2, mb3, mb4, mb5, mb6, mb7;
    JMenu m, m2, m3, m4, m5, m6, m7;
    JMenuItem mn, mn2, mn3, mn4, mn5, mn6, mn7;

    public Sonidos() {
        setTitle("English Sounds");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        Sonidos();
        panelfarm();
        principal();
        body();
        jungla();
        planetas();
        comida();
        numeros();
        vocales();
        add(pana, BorderLayout.NORTH);
        add(pan, BorderLayout.CENTER);
        colo.setLayout(new BorderLayout());
        colo.setTitle("COLORS");
        mb = new JMenuBar();
        mb2 = new JMenuBar();
        mb3 = new JMenuBar();
        mb4 = new JMenuBar();
        mb5 = new JMenuBar();
        mb6 = new JMenuBar();
        mb7 = new JMenuBar();
        mb.setBackground(new Color(1, 152, 117));
        mb2.setBackground(new Color(1, 152, 117));
        mb3.setBackground(new Color(1, 152, 117));
        mb4.setBackground(new Color(1, 152, 117));
        mb5.setBackground(new Color(1, 152, 117));
        mb6.setBackground(new Color(1, 152, 117));
        mb7.setBackground(new Color(1, 152, 117));
        m = new JMenu("Regresar");
        m2 = new JMenu("Regresar");
        m3 = new JMenu("Regresar");
        m4 = new JMenu("Regresar");
        m5 = new JMenu("Regresar");
        m6 = new JMenu("Regresar");
        m7 = new JMenu("Regresar");
        mn = new JMenuItem("Regresar");
        mn2 = new JMenuItem("Regresar");
        mn3 = new JMenuItem("Regresar");
        mn4 = new JMenuItem("Regresar");
        mn5 = new JMenuItem("Regresar");
        mn6 = new JMenuItem("Regresar");
        mn7 = new JMenuItem("Regresar");
        m.add(mn);
        m2.add(mn2);
        m3.add(mn3);
        m4.add(mn4);
        m5.add(mn5);
        m6.add(mn6);
        m7.add(mn7);
        mn.addActionListener(this);
        mn2.addActionListener(this);
        mn3.addActionListener(this);
        mn4.addActionListener(this);
        mn5.addActionListener(this);
        mn6.addActionListener(this);
        mn7.addActionListener(this);
        mb.add(m);
        mb2.add(m2);
        mb3.add(m3);
        mb4.add(m4);
        mb5.add(m5);
        mb6.add(m6);
        mb7.add(m7);
        colo.add(mb, BorderLayout.NORTH);
        colo.add(pan2, BorderLayout.CENTER);
        granja.setTitle("FARM ANIMALS");
        granja.setLayout(new BorderLayout());
        granja.add(mb2, BorderLayout.NORTH);
        granja.add(pan3, BorderLayout.CENTER);
        cuerpo.setTitle("BODY PARTS");
        cuerpo.add(mb3, BorderLayout.NORTH);
        cuerpo.add(pan4, BorderLayout.CENTER);
        jungla.setTitle("JUNGLE ANIMALS");
        jungla.add(mb4, BorderLayout.NORTH);
        jungla.add(pan5, BorderLayout.CENTER);
        planetas.setTitle("PLANETS");
        planetas.add(mb5, BorderLayout.NORTH);
        planetas.add(pan6, BorderLayout.CENTER);
        comidas.setTitle("FOODS");
        comidas.add(mb6, BorderLayout.NORTH);
        comidas.add(pan7, BorderLayout.CENTER);
        numeros.setTitle("NUMBERS");
        numeros.add(mb7, BorderLayout.NORTH);
        numeros.add(pan8, BorderLayout.CENTER);
        vocales.add(pan9);
        setVisible(true);
    }

    public void principal() {
        pana = new JPanel();
        pana.setBackground(Color.black);
        pana.setLayout(new GridLayout());
        principa = new JLabel();
        principa.setIcon(new ImageIcon("INICIO.png"));
        principa.setHorizontalAlignment(JLabel.CENTER);
        pana.add(principa);
        pan = new JPanel();
        pan.setBackground(Color.black);
        pan.setLayout(new GridLayout(2,4,20,20));
        ImageIcon col = new ImageIcon("C.png");
        c = new JButton();
        c.setBackground(Color.BLACK);
        c.setIcon(col);
        c.addActionListener(this);
        g = new JButton();
        g.setIcon(new ImageIcon("FA.png"));
        g.setBackground(Color.BLACK);
        g.addActionListener(this);
        a = new JButton();
        a.setIcon(new ImageIcon("B.png"));
        a.setBackground(Color.BLACK);
        a.addActionListener(this);
        j = new JButton();
        j.setBackground(Color.BLACK);
        j.setIcon(new ImageIcon("JA.png"));
        j.addActionListener(this);
        p = new JButton();
        p.setBackground(Color.BLACK);
        p.setIcon(new ImageIcon("P.png"));
        p.addActionListener(this);
        f = new JButton();
        f.setBackground(Color.BLACK);
        f.setIcon(new ImageIcon("F.png"));
        f.addActionListener(this);
        n = new JButton();
        n.setBackground(Color.BLACK);
        n.setIcon(new ImageIcon("N.png"));
        n.addActionListener(this);
        v=new JButton();
        v.setIcon(new ImageIcon("VOWE.png"));
        v.addActionListener(this);
        pan.add(c);
        pan.add(g);
        pan.add(a);
        pan.add(j);
        pan.add(p);
        pan.add(f);
        pan.add(n);
        pan.add(v);
    }

    public void Sonidos() {
        pan1 = new JPanel();
        pan1.setBorder(BorderFactory.createTitledBorder("COLORS"));
        pan1.setLayout(new FlowLayout());
        lab = new JLabel();
        lab.setText("Colors");
        pan1.add(lab);
        pan2 = new JPanel();
        pan2.setBorder(BorderFactory.createTitledBorder(""));
        pan2.setLayout(new GridLayout(4, 3, 20, 20));
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                bot[i][j] = new JButton();
                bot[i][j].setText(colores[k]);
                if (bot[i][j].getText().equals("Black-Negro")) {
                    bot[i][j].setBackground(Color.black);
                    bot[i][j].setIcon((new ImageIcon("Black.png")));
                }
                if (bot[i][j].getText().equals("Purple-Morado")) {
                    bot[i][j].setBackground(new Color(163, 73, 164));
                    bot[i][j].setIcon((new ImageIcon("Purple.png")));
                }
                if (bot[i][j].getText().equals("Cyan-Cyan")) {
                    bot[i][j].setBackground(Color.cyan);
                    bot[i][j].setIcon((new ImageIcon("cyan.png")));
                }
                if (bot[i][j].getText().equals("Navy blue-Azul Marino")) {
                    bot[i][j].setBackground(new Color(37, 36, 64));
                    bot[i][j].setIcon((new ImageIcon("navy.png")));
                }
                if (bot[i][j].getText().equals("Green-Verde")) {
                    bot[i][j].setBackground(Color.green);
                    bot[i][j].setIcon((new ImageIcon("green.png")));
                }
                if (bot[i][j].getText().equals("Yellow-Amarillo")) {
                    bot[i][j].setBackground(Color.yellow);
                    bot[i][j].setIcon((new ImageIcon("yellow.png")));
                }
                if (bot[i][j].getText().equals("Magenta-Magenta")) {
                    bot[i][j].setBackground(Color.magenta);
                    bot[i][j].setIcon((new ImageIcon("magenta.png")));
                }
                if (bot[i][j].getText().equals("Red-Rojo")) {
                    bot[i][j].setBackground(Color.red);
                    bot[i][j].setIcon((new ImageIcon("red.png")));
                }
                if (bot[i][j].getText().equals("Pink-Rosa")) {
                    bot[i][j].setBackground(Color.PINK);
                    bot[i][j].setIcon((new ImageIcon("pink.png")));
                }
                if (bot[i][j].getText().equals("Brown-Cafe")) {
                    bot[i][j].setBackground(new Color(75, 54, 33));
                    bot[i][j].setIcon((new ImageIcon("brown.png")));
                }
                if (bot[i][j].getText().equals("Turquoise-Turquesa")) {
                    bot[i][j].setBackground(new Color(93, 193, 185));
                    bot[i][j].setIcon((new ImageIcon("tur.png")));
                }
                if (bot[i][j].getText().equals("Orange-Naranja")) {
                    bot[i][j].setBackground(Color.orange);
                    bot[i][j].setIcon((new ImageIcon("orange.png")));
                }

                pan2.add(bot[i][j]);
                bot[i][j].addActionListener(this);
                k++;
            }
        }
    }

    public void panelfarm() {
        pan3 = new JPanel();
        pan3.setBackground(new Color(93, 193, 185));
        pan3.setBorder(BorderFactory.createTitledBorder("FARM ANIMALS"));
        pan3.setLayout(new GridLayout(4, 3, 20, 20));
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                animal[i][j] = new JButton();
                animal[i][j].setBackground(Color.orange);
                animal[i][j].setText(animales[k]);
                if (animal[i][j].getText().equals("Donkey-Burro")) {
                    animal[i][j].setIcon(new ImageIcon(this.getClass().getResource("/imagen/donkey.png")));
                }
                if (animal[i][j].getText().equals("Horse-Caballo")) {
                    animal[i][j].setIcon(new ImageIcon(this.getClass().getResource("/imagen/horse.png")));
                }
                if (animal[i][j].getText().equals("Pig-Cerdo")) {
                    animal[i][j].setIcon(new ImageIcon(this.getClass().getResource("/imagen/pig.png")));
                }
                if (animal[i][j].getText().equals("Chicken-Gallo")) {
                    animal[i][j].setIcon(new ImageIcon(this.getClass().getResource("/imagen/chicken.png")));
                }
                if (animal[i][j].getText().equals("Cat-Gato")) {
                    animal[i][j].setIcon(new ImageIcon(this.getClass().getResource("/imagen/cat.png")));
                }
                if (animal[i][j].getText().equals("Lion-Leon")) {
                    animal[i][j].setIcon(new ImageIcon(this.getClass().getResource("/imagen/lion.png")));
                }
                if (animal[i][j].getText().equals("Wolf-Lobo")) {
                    animal[i][j].setIcon(new ImageIcon(this.getClass().getResource("/imagen/wolf.png")));
                }
                if (animal[i][j].getText().equals("Monkey-Mono")) {
                    animal[i][j].setIcon(new ImageIcon(this.getClass().getResource("/imagen/monkey.png")));
                }
                if (animal[i][j].getText().equals("Dog-Perro")) {
                    animal[i][j].setIcon(new ImageIcon(this.getClass().getResource("/imagen/dog.png")));
                }
                if (animal[i][j].getText().equals("Frog-Rana")) {
                    animal[i][j].setIcon(new ImageIcon(this.getClass().getResource("/imagen/frog.png")));
                }
                if (animal[i][j].getText().equals("Tiger-Tigre")) {
                    animal[i][j].setIcon(new ImageIcon(this.getClass().getResource("/imagen/tiger.png")));
                }
                if (animal[i][j].getText().equals("Cow-Vaca")) {
                    animal[i][j].setIcon(new ImageIcon(this.getClass().getResource("/imagen/cow.png")));
                }
                animal[i][j].addActionListener(this);
                pan3.add(animal[i][j]);
                k++;
            }
        }
    }

    public void body() {
        pan4 = new JPanel();
        pan4.setLayout(new GridLayout(4, 3, 20, 20));
        pan4.setBackground(Color.yellow);
        pan4.setBorder(BorderFactory.createTitledBorder("PARTS OF BODY"));
        for (int i = 0; i < 11; i++) {
            pb[i] = new JButton();
            pb[i].setBackground(Color.pink);
            if (pb[i] == pb[0]) {
                pb[i].setText("Head-Cabeza");
                pb[i].setIcon(new ImageIcon("head.png"));
            }
            if (pb[i] == pb[1]) {
                pb[i].setText("Eye-Ojo");
                pb[i].setIcon(new ImageIcon("eye.png"));
            }
            if (pb[i] == pb[2]) {
                pb[i].setText("Nose-Nariz");
                pb[i].setIcon(new ImageIcon("nose.png"));
            }
            if (pb[i] == pb[3]) {
                pb[i].setText("Ear-Oreja");
                pb[i].setIcon(new ImageIcon("ear.png"));
            }
            if (pb[i] == pb[4]) {
                pb[i].setText("Leg-Pierna");
                pb[i].setIcon(new ImageIcon("leg.png"));
            }
            if (pb[i] == pb[5]) {
                pb[i].setText("Mouth-Boca");
                pb[i].setIcon(new ImageIcon("mouth.png"));
            }
            if (pb[i] == pb[6]) {
                pb[i].setText("Hand-Mano");
                pb[i].setIcon(new ImageIcon("hand.png"));
            }
            if (pb[i] == pb[7]) {
                pb[i].setText("Arm-Brazo");
                pb[i].setIcon(new ImageIcon("arm.png"));
            }
            if (pb[i] == pb[8]) {
                pb[i].setText("Tongue-Lengua");
                pb[i].setIcon(new ImageIcon("tongue.png"));
            }
            if (pb[i] == pb[9]) {
                pb[i].setText("Fingers-Dedos");
                pb[i].setIcon(new ImageIcon("finger.png"));
            }
            if (pb[i] == pb[10]) {
                pb[i].setText("Foot-Pie");
                pb[i].setIcon(new ImageIcon("foot.png"));
            }
            pb[i].addActionListener(this);
            pan4.add(pb[i]);
        }
    }

    public void jungla() {
        pan5 = new JPanel();
        pan5.setBackground(Color.green);
        pan5.setLayout(new GridLayout(4, 3, 20, 20));
        pan5.setBorder(BorderFactory.createTitledBorder("JUNGLE ANIMALS"));
        for (int i = 0; i < 12; i++) {
            aj[i] = new JButton();
            aj[i].setBackground(Color.cyan);
            aj[i].setText(jani[i]);
            if (i == 0) {
                aj[i].setIcon(new ImageIcon("abeja.png"));
            }
            if (i == 1) {
                aj[i].setIcon(new ImageIcon("araña.png"));
            }
            if (i == 2) {
                aj[i].setIcon(new ImageIcon("cobra.png"));
            }
            if (i == 3) {
                aj[i].setIcon(new ImageIcon("cocodrilo.png"));
            }
            if (i == 4) {
                aj[i].setIcon(new ImageIcon("elefante.png"));
            }
            if (i == 5) {
                aj[i].setIcon(new ImageIcon("iguana.png"));
            }
            if (i == 6) {
                aj[i].setIcon(new ImageIcon("jirafa.png"));
            }
            if (i == 7) {
                aj[i].setIcon(new ImageIcon("loro.png"));
            }
            if (i == 8) {
                aj[i].setIcon(new ImageIcon("monkey.png"));
            }
            if (i == 9) {
                aj[i].setIcon(new ImageIcon("oso.png"));
            }
            if (i == 10) {
                aj[i].setIcon(new ImageIcon("serpiente.png"));
            }
            if (i == 11) {
                aj[i].setIcon(new ImageIcon("tiger.png"));
            }
            aj[i].addActionListener(this);
            pan5.add(aj[i]);
        }
    }

    public void planetas() {
        pan6 = new JPanel();
        pan6.setBackground(Color.blue);
        pan6.setLayout(new GridLayout(2, 5, 20, 20));
        pan6.setBorder(BorderFactory.createTitledBorder("PLANETS"));
        for (int i = 0; i < 10; i++) {
            pla[i] = new JButton();
            pla[i].setBackground(Color.GRAY);
            pla[i].setText(planet[i]);
            if (i == 0) {
                pla[i].setIcon(new ImageIcon("sol.png"));
            }
            if (i == 1) {
                pla[i].setIcon(new ImageIcon("mercurio.png"));
            }
            if (i == 2) {
                pla[i].setIcon(new ImageIcon("venus.png"));
            }
            if (i == 3) {
                pla[i].setIcon(new ImageIcon("tierra.png"));
            }
            if (i == 4) {
                pla[i].setIcon(new ImageIcon("marte.png"));
            }
            if (i == 5) {
                pla[i].setIcon(new ImageIcon("jupiter.png"));
            }
            if (i == 6) {
                pla[i].setIcon(new ImageIcon("saturno.png"));
            }
            if (i == 7) {
                pla[i].setIcon(new ImageIcon("urano.png"));
            }
            if (i == 8) {
                pla[i].setIcon(new ImageIcon("neptuno.png"));
            }
            if (i == 9) {
                pla[i].setIcon(new ImageIcon("pluton.png"));
            }
            pla[i].addActionListener(this);
            pan6.add(pla[i]);
        }
    }

    public void comida() {
        pan7 = new JPanel();
        pan7.setBackground(Color.pink);
        pan7.setLayout(new GridLayout(3, 3, 20, 20));
        pan7.setBorder(BorderFactory.createTitledBorder("FOODS"));
        for (int i = 0; i < 9; i++) {
            comi[i] = new JButton();
            comi[i].setBackground(Color.orange);
            comi[i].setText(food[i]);
            if (i == 0) {
                comi[i].setIcon(new ImageIcon("albondigas.png"));
            }
            if (i == 1) {
                comi[i].setIcon(new ImageIcon("almeja.png"));
            }
            if (i == 2) {
                comi[i].setIcon(new ImageIcon("carne.png"));
            }
            if (i == 3) {
                comi[i].setIcon(new ImageIcon("cuenco.png"));
            }
            if (i == 4) {
                comi[i].setIcon(new ImageIcon("hamburguesa.png"));
            }
            if (i == 5) {
                comi[i].setIcon(new ImageIcon("magdalena.png"));
            }
            if (i == 6) {
                comi[i].setIcon(new ImageIcon("pizza.png"));
            }
            if (i == 7) {
                comi[i].setIcon(new ImageIcon("pollo.png"));
            }
            if (i == 8) {
                comi[i].setIcon(new ImageIcon("queso.png"));
            }
            if (i == 9) {
                comi[i].setIcon(new ImageIcon("ravioli.png"));
            }
            if (i == 10) {
                comi[i].setIcon(new ImageIcon("spaguetti.png"));
            }
            if (i == 11) {
                comi[i].setIcon(new ImageIcon("sushi.png"));
            }
            comi[i].addActionListener(this);
            pan7.add(comi[i]);
        }
    }

    public void numeros() {
        pan8 = new JPanel();
        pan8.setBackground(new Color(163, 73, 164));
        pan8.setLayout(new GridLayout(5, 2, 20, 20));
        pan8.setBorder(BorderFactory.createTitledBorder("Numbers"));
        for (int i = 0; i < 10; i++) {
            num[i] = new JButton();
            num[i].setBackground(Color.CYAN);
            num[i].setText(numb[i]);
            if (i == 0) {
                num[i].setIcon(new ImageIcon("cero.png"));
            }
            if (i == 1) {
                num[i].setIcon(new ImageIcon("uno.png"));
            }
            if (i == 2) {
                num[i].setIcon(new ImageIcon("dos.png"));
            }
            if (i == 3) {
                num[i].setIcon(new ImageIcon("tres.png"));
            }
            if (i == 4) {
                num[i].setIcon(new ImageIcon("cuatro.png"));
            }
            if (i == 5) {
                num[i].setIcon(new ImageIcon("cinco.png"));
            }
            if (i == 6) {
                num[i].setIcon(new ImageIcon("seis.png"));
            }
            if (i == 7) {
                num[i].setIcon(new ImageIcon("siete.png"));
            }
            if (i == 8) {
                num[i].setIcon(new ImageIcon("ocho.png"));
            }
            if (i == 9) {
                num[i].setIcon(new ImageIcon("nueve.png"));
            }
            num[i].addActionListener(this);
            pan8.add(num[i]);
        }
    }

    public void vocales(){
        pan9=new JPanel();
        pan9.setLayout(new GridLayout(3,2));
        for (int i = 0; i < 5; i++) {
            voc[i]=new JButton();
            if(i==0){
                voc[i].setIcon(new ImageIcon("A.png"));
            }
            if(i==1){
                voc[i].setIcon(new ImageIcon("E.png"));
            }
            if(i==2){
                voc[i].setIcon(new ImageIcon("I.png"));
            }
            if(i==3){
                voc[i].setIcon(new ImageIcon("O.png"));
            }
            if(i==4){
                voc[i].setIcon(new ImageIcon("U.png"));
            }
            voc[i].addActionListener(this);
            pan9.add(voc[i]);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == c) {
            colo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            colo.setExtendedState(MAXIMIZED_BOTH);
            colo.setVisible(true);
        }
        if (e.getSource() == g) {
            granja.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            granja.setExtendedState(MAXIMIZED_BOTH);
            granja.setVisible(true);
        }
        if (e.getSource() == a) {
            cuerpo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            cuerpo.setExtendedState(MAXIMIZED_BOTH);
            cuerpo.setVisible(true);
        }
        if (e.getSource() == j) {
            jungla.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jungla.setExtendedState(MAXIMIZED_BOTH);
            jungla.setVisible(true);
        }
        if (e.getSource() == p) {
            planetas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            planetas.setExtendedState(MAXIMIZED_BOTH);
            planetas.setVisible(true);
        }
        if (e.getSource() == f) {
            comidas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            comidas.setExtendedState(MAXIMIZED_BOTH);
            comidas.setVisible(true);
        }
        if (e.getSource() == n) {
            numeros.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            numeros.setExtendedState(MAXIMIZED_BOTH);
            numeros.setVisible(true);
        }
        if(e.getSource()==v){
            vocales.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vocales.setExtendedState(MAXIMIZED_BOTH);
            vocales.setVisible(true);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (e.getSource() == bot[i][j]) {
                    System.out.println(bot[i][j].getSize());
                    if (bot[i][j].getText().equals("Black-Negro")) {
                        lab.setText("Black");
                        pan2.setBackground(Color.black);
                        son("black");
                    }
                    if (bot[i][j].getText().equals("Purple-Morado")) {
                        lab.setText("Purple");
                        pan2.setBackground(new Color(163, 73, 164));
                        son("purple");
                    }
                    if (bot[i][j].getText().equals("Cyan-Cyan")) {
                        lab.setText("Cyan");
                        pan2.setBackground(Color .cyan);
                        son("cyan");
                    }
                    if (bot[i][j].getText().equals("Navy blue-Azul Marino")) {
                        lab.setText("Navy blue");
                        pan2.setBackground(new Color(37, 36, 64));
                        son("Navy blue");
                    }
                    if (bot[i][j].getText().equals("Green-Verde")) {
                        lab.setText("Green");
                        pan2.setBackground(Color.green);
                        son("green");
                    }
                    if (bot[i][j].getText().equals("Yellow-Amarillo")) {
                        lab.setText("Yellow");
                        pan2.setBackground(Color.yellow);
                        son("yellow");
                    }
                    if (bot[i][j].getText().equals("Magenta-Magenta")) {
                        lab.setText("Magenta");
                        pan2.setBackground(Color.magenta);
                        son("magenta");
                    }
                    if (bot[i][j].getText().equals("Red-Rojo")) {
                        lab.setText("Red");
                        pan2.setBackground(Color.red);
                        son("red");
                    }
                    if (bot[i][j].getText().equals("Pink-Rosa")) {
                        lab.setText("Pink");
                        pan2.setBackground(Color.pink);
                        son("pink");
                    }
                    if (bot[i][j].getText().equals("Brown-Cafe")) {
                        lab.setText("Brown");
                        pan2.setBackground(new Color(75, 54, 33));
                        son("brown");
                    }
                    if (bot[i][j].getText().equals("Turquoise-Turquesa")) {
                        lab.setText("Turquoise");
                        pan2.setBackground(new Color(93, 193, 185));
                        son("turquoise");
                    }
                    if (bot[i][j].getText().equals("Orange-Naranja")) {
                        lab.setText("Orange");
                        pan2.setBackground(Color.orange);
                        son("orange");
                    }
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (e.getSource() == animal[i][j]) {
                    if (animal[i][j].getText().equals("Donkey-Burro")) {
                        son("burro");

                    }
                    if (animal[i][j].getText().equals("Horse-Caballo")) {
                        son("caballo");
                    }
                    if (animal[i][j].getText().equals("Pig-Cerdo")) {
                        son("cerdo");
                    }
                    if (animal[i][j].getText().equals("Chicken-Gallo")) {
                        son("gallo");
                    }
                    if (animal[i][j].getText().equals("Cat-Gato")) {
                        son("gato");
                    }
                    if (animal[i][j].getText().equals("Lion-Leon")) {
                        son("leon");
                    }
                    if (animal[i][j].getText().equals("Wolf-Lobo")) {
                        son("lobo");
                    }
                    if (animal[i][j].getText().equals("Monkey-Mono")) {
                        son("mono");
                    }
                    if (animal[i][j].getText().equals("Dog-Perro")) {
                        son("perro");
                    }
                    if (animal[i][j].getText().equals("Frog-Rana")) {
                        son("rana");
                    }
                    if (animal[i][j].getText().equals("Tiger-Tigre")) {
                        son("Tiger");
                    }
                    if (animal[i][j].getText().equals("Cow-Vaca")) {
                        son("vaca");
                    }
                }
            }
        }

        for (int i = 0; i < 11; i++) {
            if (e.getSource() == pb[i]) {
                if (pb[i] == pb[0]) {
                    son("head");
                }
                if (pb[i] == pb[1]) {
                    son("eye");
                }
                if (pb[i] == pb[2]) {
                    son("nose");
                }
                if (pb[i] == pb[3]) {
                    son("ear");
                }
                if (pb[i] == pb[4]) {
                    son("leg");
                }
                if (pb[i] == pb[5]) {
                    son("mouth");
                }
                if (pb[i] == pb[6]) {
                    son("hand");
                }
                if (pb[i] == pb[7]) {
                    son("arm");
                }
                if (pb[i] == pb[8]) {
                    son("tongue");
                }
                if (pb[i] == pb[9]) {
                    son("fingers");
                }
                if (pb[i] == pb[10]) {
                    son("foot");
                }
            }
        }
        for (int i = 0; i < 12; i++) {
            if (e.getSource() == aj[i]) {
                if (aj[i] == aj[0]) {
                    son("Bee");
                }
                if (aj[i] == aj[1]) {
                    son("Spider");
                }
                if (aj[i] == aj[2]) {
                    son("Cobra");
                }
                if (aj[i] == aj[3]) {
                    son("Crocodile");
                }
                if (aj[i] == aj[4]) {
                    son("Elephant");
                }
                if (aj[i] == aj[5]) {
                    son("Iguana");
                }
                if (aj[i] == aj[6]) {
                    son("Giraffe");
                }
                if (aj[i] == aj[7]) {
                    son("Parrot");
                }
                if (aj[i] == aj[8]) {
                    son("Monkey");
                }
                if (aj[i] == aj[9]) {
                    son("Bear");
                }
                if (aj[i] == aj[10]) {
                    son("Snake");
                }
                if (aj[i] == aj[11]) {
                    son("Tiger");
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == pla[i]) {
                if (pla[i] == pla[0]) {
                    son("Sun");
                }
                if (pla[i] == pla[1]) {
                    son("Mercury");
                }
                if (pla[i] == pla[2]) {
                    son("Venus");
                }
                if (pla[i] == pla[3]) {
                    son("Earth");
                }
                if (pla[i] == pla[4]) {
                    son("Mars");
                }
                if (pla[i] == pla[5]) {
                    son("Jupiter");
                }
                if (pla[i] == pla[6]) {
                    son("Saturn");
                }
                if (pla[i] == pla[7]) {
                    son("Uranus");
                }
                if (pla[i] == pla[8]) {
                    son("Neptune");
                }
                if (pla[i] == pla[9]) {
                    son("Pluto");
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == comi[i]) {
                
                if (comi[i] == comi[0]) {
                    son("Meatballs");
                }
                if (comi[i] == comi[1]) {
                    son("Clam");
                }
                if (comi[i] == comi[2]) {
                    son("Meat");
                }
                if (comi[i] == comi[3]) {
                    son("Soup");
                }
                if (comi[i] == comi[4]) {
                    son("Hamburger");
                }
                if (comi[i] == comi[5]) {
                    son("Cake");
                }
                if (comi[i] == comi[6]) {
                    son("Pizza");
                }
                if (comi[i] == comi[7]) {
                    son("Chicken");
                }
                if (comi[i] == comi[8]) {
                    son("Cheese");
                }
                if (comi[i] == comi[9]) {
                    son("Ravioli");
                }
                if (comi[i] == comi[10]) {
                    son("Spaghetti");
                }
                if (comi[i] == comi[11]) {
                    son("Sushi");
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == num[i]) {
                if (i==0) {
                    son("Zero");
                }
                if (num[i] == num[1]) {
                    son("One");
                }
                if (num[i] == num[2]) {
                    son("Two");
                }
                if (num[i] == num[3]) {
                    son("Three");
                }
                if (num[i] == num[4]) {
                    son("Four");
                }
                if (num[i] == num[5]) {
                    son("Five");
                }
                if (num[i] == num[6]) {
                    son("Six");
                }
                if (num[i] == num[7]) {
                    son("Seven");
                }
                if (num[i] == num[8]) {
                    son("Eight");
                }
                if (num[i] == num[9]) {
                    son("Nine");
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            if(e.getSource()==voc[i]){
                if(i==0){
                    son("A");
                }
                if(i==1){
                    son("E");
                }
                if(i==2){
                    son("I");
                }
                if(i==3){
                    son("O");
                }
                if(i==4){
                    son("U");
                }
            }
        }
        if (e.getSource() == mn) {
            colo.setVisible(false);
        }
        if (e.getSource() == mn2) {
            granja.setVisible(false);
        }
        if (e.getSource() == mn3) {
            cuerpo.setVisible(false);
        }
        if (e.getSource() == mn4) {
            jungla.setVisible(false);
        }
        if (e.getSource() == mn5) {
            planetas.setVisible(false);
        }
        if (e.getSource() == mn6) {
            comidas.setVisible(false);
        }
        if (e.getSource() == mn7) {
            numeros.setVisible(false);
        }
    }

    public void son(String dir) {
        String usuario = System.getProperty("user.name");
        try {
            Player apl = new Player(new FileInputStream(dir + ".mp3"));
            apl.play();
        } catch (Exception ex) {

        }
    }

    public static void main(String[] args) {
        try {
            new Sonidos();
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error " + e);
        }
    }

}
