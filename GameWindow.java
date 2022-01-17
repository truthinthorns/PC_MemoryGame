package memorygame_desktopedition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class GameWindow extends javax.swing.JFrame {

    int shown = 0;
    int theme = 1;
    int score = 0;
    boolean start = true;
    JLabel first = null;
    JLabel second = null;
    HashMap<Integer, String> images = new HashMap<>();
    HashMap<Integer, Boolean> bools = new HashMap<>();
    ArrayList<Integer> correct = new ArrayList<>();
    ArrayList<JLabel> labels = new ArrayList<>();
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public GameWindow() {
        initComponents();
        InitializeBools();
        InitializeLabels();
        ShuffleImages();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        button1 = new javax.swing.JLabel();
        button2 = new javax.swing.JLabel();
        button3 = new javax.swing.JLabel();
        button4 = new javax.swing.JLabel();
        button5 = new javax.swing.JLabel();
        button6 = new javax.swing.JLabel();
        button7 = new javax.swing.JLabel();
        button8 = new javax.swing.JLabel();
        button9 = new javax.swing.JLabel();
        button10 = new javax.swing.JLabel();
        button11 = new javax.swing.JLabel();
        button12 = new javax.swing.JLabel();
        button13 = new javax.swing.JLabel();
        button14 = new javax.swing.JLabel();
        button15 = new javax.swing.JLabel();
        button16 = new javax.swing.JLabel();
        button17 = new javax.swing.JLabel();
        button18 = new javax.swing.JLabel();
        button19 = new javax.swing.JLabel();
        button20 = new javax.swing.JLabel();
        button21 = new javax.swing.JLabel();
        button22 = new javax.swing.JLabel();
        button23 = new javax.swing.JLabel();
        button24 = new javax.swing.JLabel();
        button25 = new javax.swing.JLabel();
        button26 = new javax.swing.JLabel();
        button27 = new javax.swing.JLabel();
        button28 = new javax.swing.JLabel();
        button29 = new javax.swing.JLabel();
        button30 = new javax.swing.JLabel();
        button31 = new javax.swing.JLabel();
        button32 = new javax.swing.JLabel();
        button33 = new javax.swing.JLabel();
        button34 = new javax.swing.JLabel();
        button35 = new javax.swing.JLabel();
        button36 = new javax.swing.JLabel();
        ScoreLabel = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ChangeThemeItem = new javax.swing.JMenuItem();
        LeaderboardItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ResetItem = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Memory Game");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button1MousePressed(evt);
            }
        });

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button2MousePressed(evt);
            }
        });

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button3MousePressed(evt);
            }
        });

        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button4MousePressed(evt);
            }
        });

        button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button5MousePressed(evt);
            }
        });

        button6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button6MousePressed(evt);
            }
        });

        button7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button7MousePressed(evt);
            }
        });

        button8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button8MousePressed(evt);
            }
        });

        button9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button9MousePressed(evt);
            }
        });

        button10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button10MousePressed(evt);
            }
        });

        button11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button11MousePressed(evt);
            }
        });

        button12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button12MousePressed(evt);
            }
        });

        button13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button13MousePressed(evt);
            }
        });

        button14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button14MousePressed(evt);
            }
        });

        button15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button15MousePressed(evt);
            }
        });

        button16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button16MousePressed(evt);
            }
        });

        button17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button17MousePressed(evt);
            }
        });

        button18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button18MousePressed(evt);
            }
        });

        button19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button19MousePressed(evt);
            }
        });

        button20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button20MousePressed(evt);
            }
        });

        button21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button21MousePressed(evt);
            }
        });

        button22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button22MousePressed(evt);
            }
        });

        button23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button23MousePressed(evt);
            }
        });

        button24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button24MousePressed(evt);
            }
        });

        button25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button25MousePressed(evt);
            }
        });

        button26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button26MousePressed(evt);
            }
        });

        button27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button27MousePressed(evt);
            }
        });

        button28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button28MousePressed(evt);
            }
        });

        button29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button29MousePressed(evt);
            }
        });

        button30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button30MousePressed(evt);
            }
        });

        button31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button31MousePressed(evt);
            }
        });

        button32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button32MousePressed(evt);
            }
        });

        button33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button33MousePressed(evt);
            }
        });

        button34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button34MousePressed(evt);
            }
        });

        button35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button35MousePressed(evt);
            }
        });

        button36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame_desktopedition/q1.png"))); // NOI18N
        button36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button36MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button1)
                        .addGap(18, 18, 18)
                        .addComponent(button2)
                        .addGap(18, 18, 18)
                        .addComponent(button3)
                        .addGap(18, 18, 18)
                        .addComponent(button4)
                        .addGap(18, 18, 18)
                        .addComponent(button5)
                        .addGap(18, 18, 18)
                        .addComponent(button6)
                        .addGap(18, 18, 18)
                        .addComponent(button7)
                        .addGap(18, 18, 18)
                        .addComponent(button8)
                        .addGap(18, 18, 18)
                        .addComponent(button9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button28)
                        .addGap(18, 18, 18)
                        .addComponent(button29)
                        .addGap(18, 18, 18)
                        .addComponent(button30)
                        .addGap(18, 18, 18)
                        .addComponent(button31)
                        .addGap(18, 18, 18)
                        .addComponent(button32)
                        .addGap(18, 18, 18)
                        .addComponent(button33)
                        .addGap(18, 18, 18)
                        .addComponent(button34)
                        .addGap(18, 18, 18)
                        .addComponent(button35)
                        .addGap(18, 18, 18)
                        .addComponent(button36))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(button10)
                            .addGap(18, 18, 18)
                            .addComponent(button11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button12)
                            .addGap(18, 18, 18)
                            .addComponent(button13)
                            .addGap(18, 18, 18)
                            .addComponent(button14)
                            .addGap(18, 18, 18)
                            .addComponent(button15)
                            .addGap(18, 18, 18)
                            .addComponent(button16)
                            .addGap(18, 18, 18)
                            .addComponent(button17)
                            .addGap(18, 18, 18)
                            .addComponent(button18))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(button19)
                            .addGap(18, 18, 18)
                            .addComponent(button20)
                            .addGap(18, 18, 18)
                            .addComponent(button21)
                            .addGap(18, 18, 18)
                            .addComponent(button22)
                            .addGap(18, 18, 18)
                            .addComponent(button23)
                            .addGap(18, 18, 18)
                            .addComponent(button24)
                            .addGap(18, 18, 18)
                            .addComponent(button25)
                            .addGap(18, 18, 18)
                            .addComponent(button26)
                            .addGap(18, 18, 18)
                            .addComponent(button27))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button9)
                    .addComponent(button8)
                    .addComponent(button7)
                    .addComponent(button6)
                    .addComponent(button5)
                    .addComponent(button4)
                    .addComponent(button3)
                    .addComponent(button2)
                    .addComponent(button1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button12)
                    .addComponent(button13)
                    .addComponent(button14)
                    .addComponent(button15)
                    .addComponent(button16)
                    .addComponent(button17)
                    .addComponent(button18)
                    .addComponent(button11)
                    .addComponent(button10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button23)
                    .addComponent(button24)
                    .addComponent(button25)
                    .addComponent(button26)
                    .addComponent(button27)
                    .addComponent(button21)
                    .addComponent(button22)
                    .addComponent(button19)
                    .addComponent(button20))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button34)
                    .addComponent(button35)
                    .addComponent(button36)
                    .addComponent(button32)
                    .addComponent(button33)
                    .addComponent(button30)
                    .addComponent(button31)
                    .addComponent(button28)
                    .addComponent(button29))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ScoreLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        ScoreLabel.setText("Score: 0");

        TimeLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        TimeLabel.setText("Time: 00;00;0");

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        ChangeThemeItem.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        ChangeThemeItem.setText("Change Theme");
        ChangeThemeItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ChangeThemeItemMousePressed(evt);
            }
        });
        jMenu1.add(ChangeThemeItem);

        LeaderboardItem.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        LeaderboardItem.setText("Leaderboard");
        LeaderboardItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LeaderboardItemMousePressed(evt);
            }
        });
        jMenu1.add(LeaderboardItem);
        jMenu1.add(jSeparator1);

        ResetItem.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        ResetItem.setText("Reset");
        ResetItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ResetItemMousePressed(evt);
            }
        });
        jMenu1.add(ResetItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ScoreLabel)
                        .addGap(198, 198, 198)
                        .addComponent(TimeLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ScoreLabel)
                    .addComponent(TimeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void print(String s) {
        System.out.println(s);
    }

    private void print(int i) {
        System.out.println(String.valueOf(i));
    }

    private void print(long l) {
        System.out.println(String.valueOf(l));
    }

    private void print(double d) {
        System.out.println(String.valueOf(d));
    }

    private void InitializeBools() {
        for (int i = 0; i < 36; i++) {
            bools.put(i + 1, false);
        }
    }

    private void InitializeLabels() {
        labels.add(button1);
        labels.add(button2);
        labels.add(button3);
        labels.add(button4);
        labels.add(button5);
        labels.add(button6);
        labels.add(button7);
        labels.add(button8);
        labels.add(button9);
        labels.add(button10);
        labels.add(button11);
        labels.add(button12);
        labels.add(button13);
        labels.add(button14);
        labels.add(button15);
        labels.add(button16);
        labels.add(button17);
        labels.add(button18);
        labels.add(button19);
        labels.add(button20);
        labels.add(button21);
        labels.add(button22);
        labels.add(button23);
        labels.add(button24);
        labels.add(button25);
        labels.add(button26);
        labels.add(button27);
        labels.add(button28);
        labels.add(button29);
        labels.add(button30);
        labels.add(button31);
        labels.add(button32);
        labels.add(button33);
        labels.add(button34);
        labels.add(button35);
        labels.add(button36);

    }

    private void ShuffleImages() {
        ArrayList<String> img = new ArrayList<>();
        switch (theme) {
            case 1:
                img.add("ani_buffalo.png");
                img.add("ani_chameleon.png");
                img.add("ani_chicken.png");
                img.add("ani_crocodile.png");
                img.add("ani_deer.png");
                img.add("ani_duck.png");
                img.add("ani_elephant.png");
                img.add("ani_frog.png");
                img.add("ani_gorilla.png");
                img.add("ani_hippo.png");
                img.add("ani_horse.png");
                img.add("ani_iguana.png");
                img.add("ani_llama.png");
                img.add("ani_owl.png");
                img.add("ani_panda.png");
                img.add("ani_parrot.png");
                img.add("ani_raccoon.png");
                img.add("ani_sheep.png");
                break;
            case 2:
                img.add("eco_battery.png");
                img.add("eco_bottle.png");
                img.add("eco_car1.png");
                img.add("eco_car2.png");
                img.add("eco_car3.png");
                img.add("eco_earth1.png");
                img.add("eco_earth2.png");
                img.add("eco_earth3.png");
                img.add("eco_factory.png");
                img.add("eco_female.png");
                img.add("eco_file.png");
                img.add("eco_garbage.png");
                img.add("eco_hot.png");
                img.add("eco_man.png");
                img.add("eco_recycle1.png");
                img.add("eco_recycle2.png");
                img.add("eco_waste.png");
                img.add("eco_world.png");
                break;
            case 3:
                img.add("food_burger.png");
                img.add("food_cone.png");
                img.add("food_corndog.png");
                img.add("food_frenchfries.png");
                img.add("food_friedchicken.png");
                img.add("food_hotdog.png");
                img.add("food_icecream.png");
                img.add("food_muffin.png");
                img.add("food_onigiri.png");
                img.add("food_onionrings.png");
                img.add("food_pancakes.png");
                img.add("food_pizza.png");
                img.add("food_popsicle.png");
                img.add("food_pretzel.png");
                img.add("food_shawarma.png");
                img.add("food_sushi.png");
                img.add("food_taco.png");
                img.add("food_waffle.png");
                break;
            case 4:
                img.add("med_axes.png");
                img.add("med_castle.png");
                img.add("med_catapult.png");
                img.add("med_chalice.png");
                img.add("med_crossbow.png");
                img.add("med_dungeon.png");
                img.add("med_helmet.png");
                img.add("med_horse.png");
                img.add("med_joker.png");
                img.add("med_king.png");
                img.add("med_knight.png");
                img.add("med_mace.png");
                img.add("med_ship.png");
                img.add("med_sword.png");
                img.add("med_target.png");
                img.add("med_tent.png");
                img.add("med_torch.png");
                img.add("med_viking.png");
                break;
            case 5:
                img.add("pgm_algorithm.png");
                img.add("pgm_binary.png");
                img.add("pgm_cloud.png");
                img.add("pgm_coding.png");
                img.add("pgm_csharp.png");
                img.add("pgm_database.png");
                img.add("pgm_eye.png");
                img.add("pgm_file.png");
                img.add("pgm_gearphone.png");
                img.add("pgm_html.png");
                img.add("pgm_https.png");
                img.add("pgm_laptop.png");
                img.add("pgm_monitor.png");
                img.add("pgm_phone.png");
                img.add("pgm_webbrackets.png");
                img.add("pgm_webbrowser.png");
                img.add("pgm_webcoding.png");
                img.add("pgm_webfile.png");
                break;
            case 6:
                img.add("sea_crab.png");
                img.add("sea_dolphin.png");
                img.add("sea_elver.png");
                img.add("sea_fish1.png");
                img.add("sea_fish10.png");
                img.add("sea_fish3.png");
                img.add("sea_fish5.png");
                img.add("sea_fish7.png");
                img.add("sea_fish9.png");
                img.add("sea_jellyfish.png");
                img.add("sea_lobster.png");
                img.add("sea_octopus.png");
                img.add("sea_seahorse.png");
                img.add("sea_shark.png");
                img.add("sea_shrimp.png");
                img.add("sea_squid.png");
                img.add("sea_turtle.png");
                img.add("sea_whale.png");
                break;
        }

        Collections.shuffle(img);
        Collections.shuffle(img);
        Collections.shuffle(img);
        Collections.shuffle(img);
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 36; i++) {
            ints.add(i + 1);
        }
        Collections.shuffle(ints);
        Collections.shuffle(ints);
        Collections.shuffle(ints);
        Collections.shuffle(ints);

        images.put(ints.get(0), img.get(0));
        images.put(ints.get(1), img.get(0));
        images.put(ints.get(2), img.get(1));
        images.put(ints.get(3), img.get(1));
        images.put(ints.get(4), img.get(2));
        images.put(ints.get(5), img.get(2));
        images.put(ints.get(6), img.get(3));
        images.put(ints.get(7), img.get(3));
        images.put(ints.get(8), img.get(4));
        images.put(ints.get(9), img.get(4));
        images.put(ints.get(10), img.get(5));
        images.put(ints.get(11), img.get(5));
        images.put(ints.get(12), img.get(6));
        images.put(ints.get(13), img.get(6));
        images.put(ints.get(14), img.get(7));
        images.put(ints.get(15), img.get(7));
        images.put(ints.get(16), img.get(8));
        images.put(ints.get(17), img.get(8));
        images.put(ints.get(18), img.get(9));
        images.put(ints.get(19), img.get(9));
        images.put(ints.get(20), img.get(10));
        images.put(ints.get(21), img.get(10));
        images.put(ints.get(22), img.get(11));
        images.put(ints.get(23), img.get(11));
        images.put(ints.get(24), img.get(12));
        images.put(ints.get(25), img.get(12));
        images.put(ints.get(26), img.get(13));
        images.put(ints.get(27), img.get(13));
        images.put(ints.get(28), img.get(14));
        images.put(ints.get(29), img.get(14));
        images.put(ints.get(30), img.get(15));
        images.put(ints.get(31), img.get(15));
        images.put(ints.get(32), img.get(16));
        images.put(ints.get(33), img.get(16));
        images.put(ints.get(34), img.get(17));
        images.put(ints.get(35), img.get(17));
    }

    private boolean CheckIfSame() {
        return first.getIcon().toString().equals(second.getIcon().toString());
    }

    private void HandleSameClicked() {
        first = null;
        second = null;
        for (int i = 1; i < bools.size() + 1; i++) {
            if (bools.get(i) == true) {
                correct.add(i - 1);
                bools.put(i, false);
            }
        }
        shown = 0;
        score++;
        ScoreLabel.setText("Score: " + score);
        if (score == 4) {
            Win();
        }
    }

    private void HandleDiffClicked() {
        for (int i = 1; i < bools.size() + 1; i++) {
            if (bools.get(i) == true) {
                bools.put(i, false);
            }
        }
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //change images back
                ResetShownButtons();
                first = null;
                second = null;
                shown = 0;
            }
        }, 800);
    }

    private void ResetShownButtons() {
        first.setIcon(new ImageIcon(getClass().getResource("q1.png")));
        second.setIcon(new ImageIcon(getClass().getResource("q1.png")));
    }

    private void StartGameTimer() {

        final long start = System.currentTimeMillis();
        final Runnable runnable = new Runnable() {
            public void run() {
                long now = System.currentTimeMillis();
                long min = (now - start) / 60000;
                long sec = ((now - start) / 1000) % 60;
                long ms = ((now - start) / 100) % 10;
                TimeLabel.setText("Time: " + String.format("%02d", min) + "; " + String.format("%02d", sec) + "; " + String.valueOf(ms));
            }
        };
        scheduler.scheduleAtFixedRate(runnable, 0, 100, MILLISECONDS);
    }

    private void HandleImageClicked(JLabel button, int i) {
        if (start) {
            StartGameTimer();
        }
        start = false;
        if (shown < 2) {
            if (first == null) {
                first = button;
            } else {
                second = button;
            }
            button.setIcon(new ImageIcon(getClass().getResource(images.get(i))));
            bools.put(i, true);
            shown++;
            if (shown == 2) {
                if (CheckIfSame()) {
                    HandleSameClicked();
                } else {
                    HandleDiffClicked();
                }
            }
        }
    }

    private void Win() {
        scheduler.shutdown();
    }

    private void ResetAllImages() {
        for (int i = 0; i < labels.size(); i++) {
            labels.get(i).setIcon(new ImageIcon(getClass().getResource("q1.png")));
        }
    }

    private void ResetEverything() {
        score = 0;
        ScoreLabel.setText("Score: 0");
        TimeLabel.setText("Time: 00;00;0");
        scheduler = Executors.newScheduledThreadPool(1);
        start = true;
        correct.clear();
        InitializeBools();
        ShuffleImages();
        ResetAllImages();
    }

    private void button2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MousePressed
        HandleImageClicked(button2, 2);
    }//GEN-LAST:event_button2MousePressed

    private void button1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MousePressed
        HandleImageClicked(button1, 1);
    }//GEN-LAST:event_button1MousePressed

    private void button3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MousePressed
        HandleImageClicked(button3, 3);
    }//GEN-LAST:event_button3MousePressed

    private void button4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MousePressed
        HandleImageClicked(button4, 4);
    }//GEN-LAST:event_button4MousePressed

    private void button5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MousePressed
        HandleImageClicked(button5, 5);
    }//GEN-LAST:event_button5MousePressed

    private void button6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MousePressed
        HandleImageClicked(button6, 6);
    }//GEN-LAST:event_button6MousePressed

    private void button7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MousePressed
        HandleImageClicked(button7, 7);
    }//GEN-LAST:event_button7MousePressed

    private void button8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MousePressed
        HandleImageClicked(button8, 8);
    }//GEN-LAST:event_button8MousePressed

    private void button9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MousePressed
        HandleImageClicked(button9, 9);
    }//GEN-LAST:event_button9MousePressed

    private void button10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button10MousePressed
        HandleImageClicked(button10, 10);
    }//GEN-LAST:event_button10MousePressed

    private void button11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button11MousePressed
        HandleImageClicked(button11, 11);
    }//GEN-LAST:event_button11MousePressed

    private void button12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button12MousePressed
        HandleImageClicked(button12, 12);
    }//GEN-LAST:event_button12MousePressed

    private void button13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button13MousePressed
        HandleImageClicked(button13, 13);
    }//GEN-LAST:event_button13MousePressed

    private void button14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button14MousePressed
        HandleImageClicked(button14, 14);
    }//GEN-LAST:event_button14MousePressed

    private void button15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button15MousePressed
        HandleImageClicked(button15, 15);
    }//GEN-LAST:event_button15MousePressed

    private void button16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button16MousePressed
        HandleImageClicked(button16, 16);
    }//GEN-LAST:event_button16MousePressed

    private void button17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button17MousePressed
        HandleImageClicked(button17, 17);
    }//GEN-LAST:event_button17MousePressed

    private void button18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button18MousePressed
        HandleImageClicked(button18, 18);
    }//GEN-LAST:event_button18MousePressed

    private void button19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button19MousePressed
        HandleImageClicked(button19, 19);
    }//GEN-LAST:event_button19MousePressed

    private void button20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button20MousePressed
        HandleImageClicked(button20, 20);
    }//GEN-LAST:event_button20MousePressed

    private void button21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button21MousePressed
        HandleImageClicked(button21, 21);
    }//GEN-LAST:event_button21MousePressed

    private void button22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button22MousePressed
        HandleImageClicked(button22, 22);
    }//GEN-LAST:event_button22MousePressed

    private void button23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button23MousePressed
        HandleImageClicked(button23, 23);
    }//GEN-LAST:event_button23MousePressed

    private void button24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button24MousePressed
        HandleImageClicked(button24, 24);
    }//GEN-LAST:event_button24MousePressed

    private void button25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button25MousePressed
        HandleImageClicked(button25, 25);
    }//GEN-LAST:event_button25MousePressed

    private void button26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button26MousePressed
        HandleImageClicked(button26, 26);
    }//GEN-LAST:event_button26MousePressed

    private void button27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button27MousePressed
        HandleImageClicked(button27, 27);
    }//GEN-LAST:event_button27MousePressed

    private void button28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button28MousePressed
        HandleImageClicked(button28, 28);
    }//GEN-LAST:event_button28MousePressed

    private void button29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button29MousePressed
        HandleImageClicked(button29, 29);
    }//GEN-LAST:event_button29MousePressed

    private void button30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button30MousePressed
        HandleImageClicked(button30, 30);
    }//GEN-LAST:event_button30MousePressed

    private void button31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button31MousePressed
        HandleImageClicked(button31, 31);
    }//GEN-LAST:event_button31MousePressed

    private void button32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button32MousePressed
        HandleImageClicked(button32, 32);
    }//GEN-LAST:event_button32MousePressed

    private void button33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button33MousePressed
        HandleImageClicked(button33, 33);
    }//GEN-LAST:event_button33MousePressed

    private void button34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button34MousePressed
        HandleImageClicked(button34, 34);
    }//GEN-LAST:event_button34MousePressed

    private void button35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button35MousePressed
        HandleImageClicked(button35, 35);
    }//GEN-LAST:event_button35MousePressed

    private void button36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button36MousePressed
        HandleImageClicked(button36, 36);
    }//GEN-LAST:event_button36MousePressed

    private void ChangeThemeItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeThemeItemMousePressed
        if (!scheduler.isShutdown()) {
            scheduler.shutdown();
        }
        NewJDialog dialog = new NewJDialog(this, true);
        dialog.setVisible(true);
        theme = dialog.getTheme();
        ResetEverything();
    }//GEN-LAST:event_ChangeThemeItemMousePressed

    private void ResetItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetItemMousePressed
        if (!scheduler.isShutdown()) {
            scheduler.shutdown();
        }
        ResetEverything();
    }//GEN-LAST:event_ResetItemMousePressed

    private void LeaderboardItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderboardItemMousePressed

    }//GEN-LAST:event_LeaderboardItemMousePressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ChangeThemeItem;
    private javax.swing.JMenuItem LeaderboardItem;
    private javax.swing.JMenuItem ResetItem;
    private javax.swing.JLabel ScoreLabel;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JLabel button1;
    private javax.swing.JLabel button10;
    private javax.swing.JLabel button11;
    private javax.swing.JLabel button12;
    private javax.swing.JLabel button13;
    private javax.swing.JLabel button14;
    private javax.swing.JLabel button15;
    private javax.swing.JLabel button16;
    private javax.swing.JLabel button17;
    private javax.swing.JLabel button18;
    private javax.swing.JLabel button19;
    private javax.swing.JLabel button2;
    private javax.swing.JLabel button20;
    private javax.swing.JLabel button21;
    private javax.swing.JLabel button22;
    private javax.swing.JLabel button23;
    private javax.swing.JLabel button24;
    private javax.swing.JLabel button25;
    private javax.swing.JLabel button26;
    private javax.swing.JLabel button27;
    private javax.swing.JLabel button28;
    private javax.swing.JLabel button29;
    private javax.swing.JLabel button3;
    private javax.swing.JLabel button30;
    private javax.swing.JLabel button31;
    private javax.swing.JLabel button32;
    private javax.swing.JLabel button33;
    private javax.swing.JLabel button34;
    private javax.swing.JLabel button35;
    private javax.swing.JLabel button36;
    private javax.swing.JLabel button4;
    private javax.swing.JLabel button5;
    private javax.swing.JLabel button6;
    private javax.swing.JLabel button7;
    private javax.swing.JLabel button8;
    private javax.swing.JLabel button9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
