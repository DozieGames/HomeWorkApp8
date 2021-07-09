import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Clicker extends JFrame {

        private int value;

        int i = 1;

        Clicker(int initialValue) {
            setTitle("My simple counter");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setBounds(300,300,1000, 400);
            setLayout(null);

            Font font = new Font("Arial", Font.BOLD, 45);
            Font upgradeFont = new Font("Arial", Font.BOLD, 20);
            Font textUpgradeFont = new Font("Arial", Font.BOLD, 20);

            //главное меню

            JButton buttonStart = new JButton("Начать игру");
            buttonStart.setFont(font);
            buttonStart.setBounds(300,20,375,75);
            add(buttonStart);

            JButton buttonExit = new JButton("Выход");
            buttonExit.setFont(font);
            buttonExit.setBounds(300,250,375,75);
            add(buttonExit);

            ///////////////////////////////////////////////////////////

            JLabel chooseDeal = new JLabel("Выбери дело:");
            chooseDeal.setBounds(300,50,700,50);
            chooseDeal.setFont(font);

            JButton buttonGame1 = new JButton("Огромный Скелет");
            buttonGame1.setFont(font);
            buttonGame1.setBounds(150,170,700,50);

            JButton buttonGame2 = new JButton("Маг-Волшебник");
            buttonGame2.setFont(font);
            buttonGame2.setBounds(150,235,700,50);

            JButton buttonGame3 = new JButton("Забиратель времени");
            buttonGame3.setFont(font);
            buttonGame3.setBounds(150,300,700,50);

            ////////////////////////////////////////////////////////////

            JLabel game1TextStart = new JLabel("Благородный рыцарь, помоги нам! Нашего друга ");
            game1TextStart.setBounds(250,-100,1000,300);
            game1TextStart.setFont(upgradeFont);

            JLabel game1TextStart2 = new JLabel("унёс Огромный Скелет, и нам нужна твоя помощь!");
            game1TextStart2.setBounds(250,-50,1000,300);
            game1TextStart2.setFont(upgradeFont);

            JButton buttonContinueGame1 = new JButton("Начать");
            buttonContinueGame1.setFont(upgradeFont);
            buttonContinueGame1.setBounds(140,250,700,70);

            /////////////////////////////////////////////////////////////

            //Победа в меню после Поражения Огромного Скелета

            JLabel game1TextWin1 = new JLabel("Спасибо, благородный рыцарь! Мы тебе очень сильно благодарны!");
            game1TextWin1.setBounds(250,-100,1000,300);
            game1TextWin1.setFont(upgradeFont);

            JLabel game1TextWin2 = new JLabel("В будущем, надеемся, что такого больше не повторится!");
            game1TextWin2.setBounds(250,-50,1000,300);
            game1TextWin2.setFont(upgradeFont);

            JButton buttonContinueEndGame1 = new JButton("Продолжить");
            buttonContinueEndGame1.setFont(upgradeFont);
            buttonContinueEndGame1.setBounds(140,250,700,70);

            /////////////////////////////////////////////////////////////

            //Сам счётчик
            JLabel label = new JLabel();
            label.setFont(font);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setBounds(-4000,-4415,9000,9000);

            //Тексты

            //Стоимость врагов

            JLabel labelx1 = new JLabel("Гоблин. Стоимость: 100");
            labelx1.setBounds(10,190,1000,300);
            labelx1.setFont(textUpgradeFont);

            JLabel labelx2 = new JLabel("Скелет. Стоимость: 250");
            labelx2.setBounds(10,190,1000,300);
            labelx2.setFont(textUpgradeFont);

            JLabel labelx3 = new JLabel("Гоблин с бронёй. Стоимость: 400");
            labelx3.setBounds(10,190,1000,300);
            labelx3.setFont(textUpgradeFont);

            JLabel labelx4 = new JLabel("Ведьма. Стоимость: 600");
            labelx4.setBounds(10,190,1000,300);
            labelx4.setFont(textUpgradeFont);

            JLabel labelx5 = new JLabel("Огромный Скелет. Стоимость: 1000");
            labelx5.setBounds(10,190,1000,300);
            labelx5.setFont(textUpgradeFont);

            //Нумерация уровней

            JLabel Bossx5 = new JLabel("Босс. Уровень 5");
            Bossx5.setBounds(400,-110,1000,300);
            Bossx5.setFont(font);

            JLabel numberLevel1 = new JLabel("Уровень 1");
            numberLevel1.setBounds(400,-110,1000,300);
            numberLevel1.setFont(font);


            JLabel numberLevel2 = new JLabel("Уровень 2");
            numberLevel2.setBounds(400,-110,1000,300);
            numberLevel2.setFont(font);


            JLabel numberLevel3 = new JLabel("Уровень 3");
            numberLevel3.setBounds(400,-110,1000,300);
            numberLevel3.setFont(font);



            JLabel numberLevel4 = new JLabel("Уровень 4");
            numberLevel4.setBounds(400,-110,1000,300);
            numberLevel4.setFont(font);


            //Кнопка увеличения x1

            JButton incrementButtonx1 = new JButton("x1");
            incrementButtonx1.setFont(font);
            incrementButtonx1.setBounds(20,20,300,125);


            //Кнопка увеличения x2
            JButton incrementButtonx2 = new JButton("x2");
            incrementButtonx2.setFont(font);
            incrementButtonx2.setBounds(20,20,300,125);


            //Кнопка увеличения x3
            JButton incrementButtonx3 = new JButton("x3");
            incrementButtonx3.setFont(font);
            incrementButtonx3.setBounds(20,20,300,125);


            //Кнопка увеличения x4
            JButton incrementButtonx4 = new JButton("x4");
            incrementButtonx4.setFont(font);
            incrementButtonx4.setBounds(20,20,300,125);


            //Кнопка увеличения x5
            JButton incrementButtonx5 = new JButton("x5");
            incrementButtonx5.setFont(font);
            incrementButtonx5.setBounds(20,20,300,125);

            /////////////////////////////////////////////////////////////////////////////////

            //Кнопка улучшения на x2
            JButton upgradeButtonx1 = new JButton("Гоблин был убит! Уровень пройден");
            upgradeButtonx1.setFont(upgradeFont);
            upgradeButtonx1.setBounds(20,200,700,50);

            //Кнопка улучшения на x3
            JButton upgradeButtonx2 = new JButton("Скелет был затоптан до смерти! Уровень пройден!");
            upgradeButtonx2.setFont(upgradeFont);
            upgradeButtonx2.setBounds(20,200,700,50);
            //  add(incrementButtonx2);

            JButton upgradeButtonx3 = new JButton("Гоблин с бронёй был убит! Уровень пройден!");
            upgradeButtonx3.setFont(upgradeFont);
            upgradeButtonx3.setBounds(20,200,700,50);
            //  add(incrementButtonx3);

            JButton upgradeButtonx4 = new JButton("Ведьма была убита! Уровень пройден");
            upgradeButtonx4.setFont(upgradeFont);
            upgradeButtonx4.setBounds(20,200,700,50);
            //  add(incrementButtonx4);

            JButton upgradeButtonx5 = new JButton("Огромный Скелет одержал поражение! Уровень пройден!");
            upgradeButtonx5.setFont(upgradeFont);
            upgradeButtonx5.setBounds(20,200,700,50);
            //  add(incrementButtonx5);





            //Кнопки (Действия, старт)

            buttonStart.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    remove(buttonStart);
                    remove(buttonExit);
                    add(chooseDeal);
                    add(buttonGame1);
                    add(buttonGame2);
                    add(buttonGame3);
                    setVisible(false);
                    setVisible(true);
                }
            });

            buttonExit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            buttonGame1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    remove(chooseDeal);
                    remove(buttonGame1);
                    remove(buttonGame2);
                    remove(buttonGame3);
                    add(game1TextStart);
                    add(game1TextStart2);
                    add(buttonContinueGame1);
                    setVisible(false);
                    setVisible(true);
                }
            });

            buttonContinueGame1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    remove(game1TextStart);
                    remove(game1TextStart2);
                    remove(buttonContinueGame1);
                    add(label, BorderLayout.EAST);
                     add(labelx1);
                     add(numberLevel1);
                     add(incrementButtonx1);
                    setVisible(false);
                    setVisible(true);
                }
            });

            //Кнопки (Действия = Огромный Скелет)

            incrementButtonx1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value++;
                    label.setText(String.valueOf(value));
                    if (value >= 20) {
                        add(upgradeButtonx1);
                    }
                }
            });

            incrementButtonx2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value = value + 2;
                    label.setText(String.valueOf(value));
                    if (value >= 20) {
                        add(upgradeButtonx2);
                    }
                }
            });

            incrementButtonx3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value = value + 3;
                    label.setText(String.valueOf(value));
                    if (value >= 20) {
                        add(upgradeButtonx3);
                    }
                }
            });

            incrementButtonx4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value = value + 4;
                    label.setText(String.valueOf(value));
                    if (value >= 20) {
                        add(upgradeButtonx4);
                    }
                }
            });

            incrementButtonx5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value = value + 5;
                    label.setText(String.valueOf(value));
                    if (value >= 20) {
                        add(upgradeButtonx5);
                    }
                }
            });



            //Улучшения кнопки (Действия)

            upgradeButtonx1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value = 0;
                    remove(incrementButtonx1);
                    remove(upgradeButtonx1);
                    remove(labelx1);
                    remove(numberLevel1);
                    add(incrementButtonx2);
                    add(labelx2);
                    add(numberLevel2);
                    setVisible(false);
                    setVisible(true);
                }
            });

            upgradeButtonx2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value = 0;
                    remove(incrementButtonx2);
                    remove(upgradeButtonx2);
                    remove(labelx2);
                    remove(numberLevel2);
                    add(incrementButtonx3);
                    add(labelx3);
                    add(numberLevel3);
                    setVisible(false);
                    setVisible(true);
                }
            });

            upgradeButtonx3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value = 0;
                    remove(incrementButtonx3);
                    remove(upgradeButtonx3);
                    remove(labelx3);
                    remove(numberLevel3);
                    add(incrementButtonx4);
                    add(labelx4);
                    add(numberLevel4);
                    setVisible(false);
                    setVisible(true);
                }
            });

            upgradeButtonx4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value = 0;
                    remove(incrementButtonx4);
                    remove(upgradeButtonx4);
                    remove(labelx4);
                    remove(numberLevel4);
                    add(incrementButtonx5);
                    add(labelx5);
                    add(Bossx5);
                    setVisible(false);
                    setVisible(true);
                }
            });

            upgradeButtonx5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value = 0;
                    remove(label);
                    remove(incrementButtonx5);
                    remove(upgradeButtonx5);
                    remove(labelx5);
                    remove(Bossx5);
                    add(game1TextWin1);
                    add(game1TextWin2);
                    add(buttonContinueEndGame1);
                    setVisible(false);
                    setVisible(true);
                }
            });
            // Главное меню после победы над Скелетом
            buttonContinueEndGame1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    remove(game1TextWin1);
                    remove(game1TextWin2);
                    remove(buttonContinueEndGame1);
                    add(buttonStart);
                    add(buttonExit);
                    setVisible(false);
                    setVisible(true);
                }
            });

            value = initialValue;
            label.setText(String.valueOf(value));

            setVisible(true);
        }
        public static void main(String[] args) {
            new Clicker(0);
        }
    }
