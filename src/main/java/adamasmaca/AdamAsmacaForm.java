package adamasmaca;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AdamAsmacaForm extends JFrame {

    private final String anaKlasor = "C:\\P2Oyun";
    private final String resimKlasoru = anaKlasor + "\\Resimler";
    private final String txtKlasoru = anaKlasor + "\\TXTDosyalar";
    private final String kelimeDosyasi = txtKlasoru + "\\kelimeler.txt";
    private final String sifreDosyasi = txtKlasoru + "\\sifre.txt";
    private final String logDosyasi = txtKlasoru + "\\log.txt";
    private final String oyunDosyasi = txtKlasoru + "\\oyunlar.txt";

    private final String[] alfabe = {
        "A", "B", "C", "\u00c7", "D", "E", "F", "G", "\u011e", "H",
        "I", "\u0130", "J", "K", "L", "M", "N", "O", "\u00d6", "P",
        "R", "S", "\u015e", "T", "U", "\u00dc", "V", "Y", "Z"
    };

    private ArrayList<String> kelimeler = new ArrayList<String>();
    private ArrayList<String> tahminler = new ArrayList<String>();
    private ArrayList<JLabel> kelimeLabellari = new ArrayList<JLabel>();
    private ArrayList<JButton> alfabeButonlari = new ArrayList<JButton>();

    private String secilenKelime = "";
    private String[] kelimeHarfleri, gorunenHarfler;
    private int yanlisSayisi = 0, sure = 0;
    private boolean oyunAktif = false;

    private javax.swing.Timer timer;
    private Random rnd = new Random();
    private Locale tr = new Locale("tr", "TR");
    private SimpleDateFormat tarih = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public AdamAsmacaForm() {
        initComponents();
        setLocationRelativeTo(null);
        dosyalariHazirla();
        logYaz("PROGRAM_ACILDI", "Uygulama baslatildi");

        if (!sifreKontrol()) {
            System.exit(0);
        }

        girisMesajiGoster();
        alfabeOlustur();
        tahminAlanlariniAyarla(false);
        kelimeleriOku();
        tablolariYenile();
    }

    public static void main(String[] args) {
        new AdamAsmacaForm().setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablar = new javax.swing.JTabbedPane();
        pnlOyunTab = new javax.swing.JPanel();
        pnlUst = new javax.swing.JPanel();
        pnlBilgi = new javax.swing.JPanel();
        lblSure = new javax.swing.JLabel();
        lblHak = new javax.swing.JLabel();
        lblDurum = new javax.swing.JLabel();
        pnlAlfabe = new javax.swing.JPanel();
        lblTahminler = new javax.swing.JLabel();
        pnlOrta = new javax.swing.JPanel();
        pnlSol = new javax.swing.JPanel();
        pnlKelime = new javax.swing.JPanel();
        pnlTahmin = new javax.swing.JPanel();
        lblHarfTahmini = new javax.swing.JLabel();
        txtHarf = new javax.swing.JTextField();
        lblKelimeTahmini = new javax.swing.JLabel();
        txtKelime = new javax.swing.JTextField();
        btnHarf = new javax.swing.JButton();
        btnKelime = new javax.swing.JButton();
        pnlSag = new javax.swing.JPanel();
        lblResim = new javax.swing.JLabel();
        pnlOyunButon = new javax.swing.JPanel();
        btnBasla = new javax.swing.JButton();
        btnYenidenBaslat = new javax.swing.JButton();
        pnlSkorTab = new javax.swing.JPanel();
        scrollSkor = new javax.swing.JScrollPane();
        tblSkorlar = new javax.swing.JTable();
        pnlSkorButon = new javax.swing.JPanel();
        btnSkorYenile = new javax.swing.JButton();
        btnSkorTemizle = new javax.swing.JButton();
        pnlLogTab = new javax.swing.JPanel();
        scrollLog = new javax.swing.JScrollPane();
        tblLoglar = new javax.swing.JTable();
        pnlLogButon = new javax.swing.JPanel();
        btnLogYenile = new javax.swing.JButton();
        btnLogTemizle = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuOyun = new javax.swing.JMenu();
        itemBasla = new javax.swing.JMenuItem();
        itemYenidenBaslat = new javax.swing.JMenuItem();
        menuAyirici = new javax.swing.JPopupMenu.Separator();
        itemCikis = new javax.swing.JMenuItem();
        menuKayitlar = new javax.swing.JMenu();
        itemTablolariYenile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adam Asmaca");
        setPreferredSize(new java.awt.Dimension(900, 650));

        lblSure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSure.setText("Sure: 0 sn");

        lblHak.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHak.setText("Yanlis: 0 / 11");

        lblDurum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDurum.setText("Oyuna baslamak icin butona tiklayiniz.");

        javax.swing.GroupLayout pnlBilgiLayout = new javax.swing.GroupLayout(pnlBilgi);
        pnlBilgi.setLayout(pnlBilgiLayout);
        pnlBilgiLayout.setHorizontalGroup(
            pnlBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBilgiLayout.createSequentialGroup()
                .addComponent(lblSure, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(lblHak, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(lblDurum, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
        );
        pnlBilgiLayout.setVerticalGroup(
            pnlBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSure, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(lblHak, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(lblDurum, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlAlfabeLayout = new javax.swing.GroupLayout(pnlAlfabe);
        pnlAlfabe.setLayout(pnlAlfabeLayout);
        pnlAlfabeLayout.setHorizontalGroup(
            pnlAlfabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );
        pnlAlfabeLayout.setVerticalGroup(
            pnlAlfabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        lblTahminler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTahminler.setText("Tahmin edilen harfler: -");

        javax.swing.GroupLayout pnlUstLayout = new javax.swing.GroupLayout(pnlUst);
        pnlUst.setLayout(pnlUstLayout);
        pnlUstLayout.setHorizontalGroup(
            pnlUstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBilgi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAlfabe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTahminler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlUstLayout.setVerticalGroup(
            pnlUstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUstLayout.createSequentialGroup()
                .addComponent(pnlBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnlAlfabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblTahminler, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlKelimeLayout = new javax.swing.GroupLayout(pnlKelime);
        pnlKelime.setLayout(pnlKelimeLayout);
        pnlKelimeLayout.setHorizontalGroup(
            pnlKelimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );
        pnlKelimeLayout.setVerticalGroup(
            pnlKelimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        lblHarfTahmini.setText("Harf Tahmini:");

        txtHarf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHarfActionPerformed(evt);
            }
        });

        lblKelimeTahmini.setText("Kelime Tahmini:");

        txtKelime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKelimeActionPerformed(evt);
            }
        });

        btnHarf.setText("Harf Tahmin Et");
        btnHarf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHarfActionPerformed(evt);
            }
        });

        btnKelime.setText("Kelime Tahmin Et");
        btnKelime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKelimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTahminLayout = new javax.swing.GroupLayout(pnlTahmin);
        pnlTahmin.setLayout(pnlTahminLayout);
        pnlTahminLayout.setHorizontalGroup(
            pnlTahminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTahminLayout.createSequentialGroup()
                .addGroup(pnlTahminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHarfTahmini, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKelimeTahmini, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHarf, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTahminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHarf)
                    .addComponent(txtKelime)
                    .addComponent(btnKelime, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
        );
        pnlTahminLayout.setVerticalGroup(
            pnlTahminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTahminLayout.createSequentialGroup()
                .addGroup(pnlTahminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHarfTahmini)
                    .addComponent(txtHarf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTahminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKelimeTahmini)
                    .addComponent(txtKelime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTahminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHarf)
                    .addComponent(btnKelime)))
        );

        javax.swing.GroupLayout pnlSolLayout = new javax.swing.GroupLayout(pnlSol);
        pnlSol.setLayout(pnlSolLayout);
        pnlSolLayout.setHorizontalGroup(
            pnlSolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlKelime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTahmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlSolLayout.setVerticalGroup(
            pnlSolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSolLayout.createSequentialGroup()
                .addComponent(pnlKelime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTahmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblResim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResim.setText("Ilk yanlis tahminde 1.jpg gosterilecek");

        btnBasla.setText("Oyuna Basla");
        btnBasla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaslaActionPerformed(evt);
            }
        });

        btnYenidenBaslat.setText("Yeniden Baslat");
        btnYenidenBaslat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYenidenBaslatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOyunButonLayout = new javax.swing.GroupLayout(pnlOyunButon);
        pnlOyunButon.setLayout(pnlOyunButonLayout);
        pnlOyunButonLayout.setHorizontalGroup(
            pnlOyunButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOyunButonLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(btnBasla, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnYenidenBaslat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pnlOyunButonLayout.setVerticalGroup(
            pnlOyunButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOyunButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnBasla)
                .addComponent(btnYenidenBaslat))
        );

        javax.swing.GroupLayout pnlSagLayout = new javax.swing.GroupLayout(pnlSag);
        pnlSag.setLayout(pnlSagLayout);
        pnlSagLayout.setHorizontalGroup(
            pnlSagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlOyunButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlSagLayout.setVerticalGroup(
            pnlSagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSagLayout.createSequentialGroup()
                .addComponent(lblResim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOyunButon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlOrtaLayout = new javax.swing.GroupLayout(pnlOrta);
        pnlOrta.setLayout(pnlOrtaLayout);
        pnlOrtaLayout.setHorizontalGroup(
            pnlOrtaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrtaLayout.createSequentialGroup()
                .addComponent(pnlSol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOrtaLayout.setVerticalGroup(
            pnlOrtaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlOyunTabLayout = new javax.swing.GroupLayout(pnlOyunTab);
        pnlOyunTab.setLayout(pnlOyunTabLayout);
        pnlOyunTabLayout.setHorizontalGroup(
            pnlOyunTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOyunTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOyunTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlUst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOrta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlOyunTabLayout.setVerticalGroup(
            pnlOyunTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOyunTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOrta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablar.addTab("tab1", pnlOyunTab);

        tblSkorlar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarih", "Sure", "Sonuc", "Kelime"
            }
        ));
        scrollSkor.setViewportView(tblSkorlar);

        btnSkorYenile.setText("Yenile");
        btnSkorYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkorYenileActionPerformed(evt);
            }
        });

        btnSkorTemizle.setText("Temizle");
        btnSkorTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkorTemizleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSkorButonLayout = new javax.swing.GroupLayout(pnlSkorButon);
        pnlSkorButon.setLayout(pnlSkorButonLayout);
        pnlSkorButonLayout.setHorizontalGroup(
            pnlSkorButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSkorButonLayout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(btnSkorYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSkorTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );
        pnlSkorButonLayout.setVerticalGroup(
            pnlSkorButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSkorButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnSkorYenile)
                .addComponent(btnSkorTemizle))
        );

        javax.swing.GroupLayout pnlSkorTabLayout = new javax.swing.GroupLayout(pnlSkorTab);
        pnlSkorTab.setLayout(pnlSkorTabLayout);
        pnlSkorTabLayout.setHorizontalGroup(
            pnlSkorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSkorTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSkorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollSkor)
                    .addComponent(pnlSkorButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSkorTabLayout.setVerticalGroup(
            pnlSkorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSkorTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollSkor, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSkorButon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tablar.addTab("tab2", pnlSkorTab);

        tblLoglar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarih", "Etiket", "Aciklama"
            }
        ));
        scrollLog.setViewportView(tblLoglar);

        btnLogYenile.setText("Yenile");
        btnLogYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogYenileActionPerformed(evt);
            }
        });

        btnLogTemizle.setText("Temizle");
        btnLogTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogTemizleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLogButonLayout = new javax.swing.GroupLayout(pnlLogButon);
        pnlLogButon.setLayout(pnlLogButonLayout);
        pnlLogButonLayout.setHorizontalGroup(
            pnlLogButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogButonLayout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(btnLogYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );
        pnlLogButonLayout.setVerticalGroup(
            pnlLogButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnLogYenile)
                .addComponent(btnLogTemizle))
        );

        javax.swing.GroupLayout pnlLogTabLayout = new javax.swing.GroupLayout(pnlLogTab);
        pnlLogTab.setLayout(pnlLogTabLayout);
        pnlLogTabLayout.setHorizontalGroup(
            pnlLogTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLogTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollLog)
                    .addComponent(pnlLogButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlLogTabLayout.setVerticalGroup(
            pnlLogTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollLog, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLogButon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tablar.addTab("tab3", pnlLogTab);

        menuOyun.setText("Oyun");

        itemBasla.setText("Oyuna Basla");
        itemBasla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBaslaActionPerformed(evt);
            }
        });
        menuOyun.add(itemBasla);

        itemYenidenBaslat.setText("Oyunu Yeniden Baslat");
        itemYenidenBaslat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemYenidenBaslatActionPerformed(evt);
            }
        });
        menuOyun.add(itemYenidenBaslat);
        menuOyun.add(menuAyirici);

        itemCikis.setText("Cikis");
        itemCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCikisActionPerformed(evt);
            }
        });
        menuOyun.add(itemCikis);

        menuBar.add(menuOyun);

        menuKayitlar.setText("Kayitlar");

        itemTablolariYenile.setText("Tablolari Yenile");
        itemTablolariYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTablolariYenileActionPerformed(evt);
            }
        });
        menuKayitlar.add(itemTablolariYenile);

        menuBar.add(menuKayitlar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablar, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBaslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaslaActionPerformed
        oyunuBaslat();
    }//GEN-LAST:event_btnBaslaActionPerformed

    private void btnYenidenBaslatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYenidenBaslatActionPerformed
        oyunuBaslat();
    }//GEN-LAST:event_btnYenidenBaslatActionPerformed

    private void btnHarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHarfActionPerformed
        harfTahminEt();
    }//GEN-LAST:event_btnHarfActionPerformed

    private void btnKelimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelimeActionPerformed
        kelimeTahminEt();
    }//GEN-LAST:event_btnKelimeActionPerformed

    private void txtHarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHarfActionPerformed
        harfTahminEt();
    }//GEN-LAST:event_txtHarfActionPerformed

    private void txtKelimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKelimeActionPerformed
        kelimeTahminEt();
    }//GEN-LAST:event_txtKelimeActionPerformed

    private void btnSkorYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkorYenileActionPerformed
        tablolariYenile();
    }//GEN-LAST:event_btnSkorYenileActionPerformed

    private void btnSkorTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkorTemizleActionPerformed
        dosyaTemizle(oyunDosyasi, "oyunlar.txt");
    }//GEN-LAST:event_btnSkorTemizleActionPerformed

    private void btnLogYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogYenileActionPerformed
        tablolariYenile();
    }//GEN-LAST:event_btnLogYenileActionPerformed

    private void btnLogTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogTemizleActionPerformed
        dosyaTemizle(logDosyasi, "log.txt");
    }//GEN-LAST:event_btnLogTemizleActionPerformed

    private void itemBaslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBaslaActionPerformed
        oyunuBaslat();
    }//GEN-LAST:event_itemBaslaActionPerformed

    private void itemYenidenBaslatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemYenidenBaslatActionPerformed
        oyunuBaslat();
    }//GEN-LAST:event_itemYenidenBaslatActionPerformed

    private void itemCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCikisActionPerformed
        logYaz("PROGRAM_KAPANDI", "Menuden cikis yapildi");
        System.exit(0);
    }//GEN-LAST:event_itemCikisActionPerformed

    private void itemTablolariYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTablolariYenileActionPerformed
        tablolariYenile();
    }//GEN-LAST:event_itemTablolariYenileActionPerformed

    private void girisMesajiGoster() {
        JOptionPane.showMessageDialog(this,
                "Adam Asmaca Oyununa Hos Geldiniz\n"
                + "11 yanlis tahmin hakkiniz vardir.\n"
                + "Harf veya kelime tahmini yapabilirsiniz.\n"
                + "Skorlar ve loglar sekmelerden goruntulenebilir.",
                "Oyun Bilgilendirme", JOptionPane.INFORMATION_MESSAGE);
    }

    private void alfabeOlustur() {
        pnlAlfabe.removeAll();
        pnlAlfabe.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 4));
        alfabeButonlari.clear();
        for (int i = 0; i < alfabe.length; i++) {
            final String harf = alfabe[i];
            JButton button = new JButton(harf);
            button.setPreferredSize(new Dimension(38, 30));
            button.setMargin(new Insets(1, 1, 1, 1));
            button.setFocusPainted(false);
            button.setBackground(Color.WHITE);
            button.setFont(new Font("Arial", Font.BOLD, 13));
            button.setEnabled(false);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    harfTahminEtButondan(harf);
                }
            });
            pnlAlfabe.add(button);
            alfabeButonlari.add(button);
        }
    }

    private void oyunuBaslat() {
        kelimeleriOku();
        if (kelimeler.isEmpty()) {
            JOptionPane.showMessageDialog(this, "kelimeler.txt icinde kelime bulunamadi.");
            return;
        }
        if (timer != null) {
            timer.stop();
        }

        secilenKelime = kelimeler.get(rnd.nextInt(kelimeler.size())).toUpperCase(tr);
        kelimeHarfleri = harflereAyir(secilenKelime);
        gorunenHarfler = new String[kelimeHarfleri.length];
        yanlisSayisi = 0;
        sure = 0;
        oyunAktif = true;
        tahminler.clear();

        pnlKelime.removeAll();
        pnlKelime.setLayout(new FlowLayout(FlowLayout.CENTER, 8, 25));
        kelimeLabellari.clear();
        for (int i = 0; i < kelimeHarfleri.length; i++) {
            gorunenHarfler[i] = "*";
            JLabel label = new JLabel("*", SwingConstants.CENTER);
            label.setPreferredSize(new Dimension(35, 45));
            label.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            label.setFont(new Font("Arial", Font.BOLD, 28));
            pnlKelime.add(label);
            kelimeLabellari.add(label);
        }
        pnlKelime.revalidate();
        pnlKelime.repaint();

        alfabeSifirla();
        txtHarf.setText("");
        txtKelime.setText("");
        lblSure.setText("Sure: 0 sn");
        lblHak.setText("Yanlis: 0 / 11");
        lblDurum.setText("Oyun basladi. Tahmin yapiniz.");
        lblTahminler.setText("Tahmin edilen harfler: -");
        lblResim.setIcon(null);
        lblResim.setText("Ilk yanlis tahminde 1.jpg gosterilecek");
        tahminAlanlariniAyarla(true);

        timer = new javax.swing.Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sure++;
                lblSure.setText("Sure: " + sure + " sn");
            }
        });
        timer.start();
        logYaz("OYUN_BASLADI", "Yeni oyun baslatildi");
        tablar.setSelectedIndex(0);
    }

    private void harfTahminEt() {
        String harf = txtHarf.getText().trim().toUpperCase(tr);
        txtHarf.setText("");
        harfTahmininiIsle(harf);
    }

    private void harfTahminEtButondan(String harf) {
        harfTahmininiIsle(harf);
    }

    private void harfTahmininiIsle(String harf) {
        if (!oyunAktif) {
            JOptionPane.showMessageDialog(this, "Once oyunu baslatiniz.");
            return;
        }
        if (harf.length() == 0) {
            JOptionPane.showMessageDialog(this, "Harf tahmini giriniz.");
            return;
        }
        harf = harflereAyir(harf)[0];
        if (tahminler.contains(harf)) {
            lblDurum.setText("Bu harf daha once tahmin edildi: " + harf);
            return;
        }

        tahminler.add(harf);
        tahminleriYaz();
        boolean dogru = false;
        for (int i = 0; i < kelimeHarfleri.length; i++) {
            if (kelimeHarfleri[i].equals(harf)) {
                gorunenHarfler[i] = harf;
                kelimeLabellari.get(i).setText(harf);
                dogru = true;
            }
        }

        alfabeIsaretle(harf, dogru);
        if (dogru) {
            lblDurum.setText("Dogru harf: " + harf);
            kazanmaKontrol();
        } else {
            lblDurum.setText("Yanlis harf: " + harf);
            yanlisTahmin();
        }
    }

    private void kelimeTahminEt() {
        if (!oyunAktif) {
            JOptionPane.showMessageDialog(this, "Once oyunu baslatiniz.");
            return;
        }
        String tahmin = txtKelime.getText().trim().toUpperCase(tr);
        txtKelime.setText("");
        if (tahmin.length() == 0) {
            JOptionPane.showMessageDialog(this, "Kelime tahmini giriniz.");
            return;
        }

        if (tahmin.equals(secilenKelime)) {
            for (int i = 0; i < kelimeHarfleri.length; i++) {
                gorunenHarfler[i] = kelimeHarfleri[i];
                kelimeLabellari.get(i).setText(kelimeHarfleri[i]);
                alfabeIsaretle(kelimeHarfleri[i], true);
            }
            oyunuBitir(true);
        } else {
            lblDurum.setText("Kelime tahmini yanlis.");
            yanlisTahmin();
        }
    }

    private void yanlisTahmin() {
        yanlisSayisi++;
        lblHak.setText("Yanlis: " + yanlisSayisi + " / 11");
        resmiGoster(yanlisSayisi);
        if (yanlisSayisi >= 11) {
            oyunuBitir(false);
        }
    }

    private void kazanmaKontrol() {
        for (int i = 0; i < gorunenHarfler.length; i++) {
            if (gorunenHarfler[i].equals("*")) {
                return;
            }
        }
        oyunuBitir(true);
    }

    private void oyunuBitir(boolean kazandi) {
        oyunAktif = false;
        if (timer != null) {
            timer.stop();
        }
        tahminAlanlariniAyarla(false);

        String sonuc = kazandi ? "Kazandi" : "Kaybetti";
        lblDurum.setText("Oyun bitti. Sonuc: " + sonuc + " Kelime: " + secilenKelime);
        oyunKaydiYaz(sonuc);
        logYaz(kazandi ? "OYUN_KAZANILDI" : "OYUN_KAYBEDILDI",
                "Kelime: " + secilenKelime + ", Sure: " + sure + " sn");
        tablolariYenile();
        JOptionPane.showMessageDialog(this,
                "Sonuc: " + sonuc + "\nKelime: " + secilenKelime + "\nSure: " + sure + " sn");
    }

    private void tahminAlanlariniAyarla(boolean aktif) {
        txtHarf.setEnabled(aktif);
        txtKelime.setEnabled(aktif);
        btnHarf.setEnabled(aktif);
        btnKelime.setEnabled(aktif);
        for (int i = 0; i < alfabeButonlari.size(); i++) {
            JButton button = alfabeButonlari.get(i);
            button.setEnabled(aktif && !tahminler.contains(button.getText()));
        }
    }

    private void tahminleriYaz() {
        String yazi = "";
        for (int i = 0; i < tahminler.size(); i++) {
            yazi += tahminler.get(i);
            if (i < tahminler.size() - 1) {
                yazi += ", ";
            }
        }
        lblTahminler.setText("Tahmin edilen harfler: " + yazi);
    }

    private void alfabeSifirla() {
        for (int i = 0; i < alfabeButonlari.size(); i++) {
            JButton button = alfabeButonlari.get(i);
            button.setBackground(Color.WHITE);
            button.setForeground(Color.BLACK);
            button.setEnabled(oyunAktif);
        }
    }

    private void alfabeIsaretle(String harf, boolean dogru) {
        for (int i = 0; i < alfabeButonlari.size(); i++) {
            JButton button = alfabeButonlari.get(i);
            if (button.getText().equals(harf)) {
                button.setBackground(dogru ? new Color(180, 240, 180) : new Color(250, 190, 190));
                button.setEnabled(false);
                return;
            }
        }
    }

    private void resmiGoster(int resimNo) {
        ImageIcon icon = new ImageIcon(resimKlasoru + "\\" + resimNo + ".jpg");
        if (icon.getIconWidth() <= 0) {
            lblResim.setIcon(null);
            lblResim.setText(resimNo + ".jpg bulunamadi.");
            return;
        }

        int hedefW = lblResim.getWidth() - 20;
        int hedefH = lblResim.getHeight() - 20;
        if (hedefW <= 0) {
            hedefW = 420;
        }
        if (hedefH <= 0) {
            hedefH = 300;
        }
        double oran = Math.min((double) hedefW / icon.getIconWidth(),
                (double) hedefH / icon.getIconHeight());
        oran = Math.min(oran, 1.0);

        int w = (int) (icon.getIconWidth() * oran);
        int h = (int) (icon.getIconHeight() * oran);
        Image img = icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
        lblResim.setText("");
        lblResim.setIcon(new ImageIcon(img));
    }

    private String[] harflereAyir(String kelime) {
        String[] harfler = new String[kelime.length()];
        for (int i = 0; i < kelime.length(); i++) {
            harfler[i] = String.valueOf(kelime.charAt(i));
        }
        return harfler;
    }

    private boolean sifreKontrol() {
        String mevcutSifre = sifreOku();
        if (mevcutSifre.length() == 0) {
            return ilkSifreOlustur();
        }

        for (int i = 1; i <= 3; i++) {
            String girilen = sifreAl("Sifre Girisi (" + i + "/3)");
            if (girilen == null) {
                logYaz("SIFRE_IPTAL", "Kullanici sifre ekranini kapatti");
                return false;
            }
            if (girilen.equals(mevcutSifre)) {
                logYaz("SIFRE_DOGRU", "Kullanici girisi basarili");
                return true;
            }
            logYaz("SIFRE_HATALI", "Hatali sifre denemesi: " + i);
            JOptionPane.showMessageDialog(this, "Sifre hatali.");
        }

        logYaz("PROGRAM_KAPANDI", "3 kez hatali sifre girildi");
        JOptionPane.showMessageDialog(this, "3 kez hatali sifre girildi. Program kapatiliyor.");
        return false;
    }

    private boolean ilkSifreOlustur() {
        String yeniSifre = sifreAl("Ilk sifreyi belirleyiniz");
        if (yeniSifre == null || yeniSifre.length() == 0) {
            logYaz("SIFRE_OLUSTURMA_IPTAL", "Sifre belirlenmedi");
            JOptionPane.showMessageDialog(this, "Sifre bos olamaz.");
            return false;
        }
        sifreYaz(yeniSifre);
        logYaz("SIFRE_OLUSTURULDU", "Ilk sifre kaydedildi");
        return true;
    }

    private String sifreAl(String baslik) {
        JPasswordField alan = new JPasswordField();
        int cevap = JOptionPane.showConfirmDialog(this, alan, baslik, JOptionPane.OK_CANCEL_OPTION);
        if (cevap != JOptionPane.OK_OPTION) {
            return null;
        }
        return new String(alan.getPassword()).trim();
    }

    private boolean sifreDogruMu(String aciklama) {
        String girilen = sifreAl("Sifre Kontrol");
        if (girilen == null) {
            logYaz("SIFRE_IPTAL", aciklama);
            return false;
        }
        boolean dogru = girilen.equals(sifreOku());
        logYaz(dogru ? "SIFRE_DOGRU" : "SIFRE_HATALI", aciklama);
        if (!dogru) {
            JOptionPane.showMessageDialog(this, "Sifre hatali.");
        }
        return dogru;
    }

    private void kelimeleriOku() {
        kelimeler.clear();
        try {
            BufferedReader br = dosyaOku(kelimeDosyasi);
            String satir;
            while ((satir = br.readLine()) != null) {
                satir = satir.trim();
                if (satir.length() >= 6) {
                    kelimeler.add(satir);
                }
            }
            br.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Kelimeler okunamadi.");
        }
    }

    private void tablolariYenile() {
        tabloDoldur((DefaultTableModel) tblSkorlar.getModel(), oyunDosyasi, 4);
        tabloDoldur((DefaultTableModel) tblLoglar.getModel(), logDosyasi, 3);
    }

    private void tabloDoldur(DefaultTableModel model, String dosya, int kolonSayisi) {
        model.setRowCount(0);
        try {
            BufferedReader br = dosyaOku(dosya);
            String satir;
            while ((satir = br.readLine()) != null) {
                if (satir.trim().length() == 0) {
                    continue;
                }
                String[] parcalar = satir.split("\\|");
                Object[] row = new Object[kolonSayisi];
                for (int i = 0; i < kolonSayisi; i++) {
                    row[i] = i < parcalar.length ? parcalar[i] : "";
                }
                model.addRow(row);
            }
            br.close();
        } catch (Exception ex) {
        }
    }

    private void dosyaTemizle(String dosya, String ad) {
        if (!sifreDogruMu(ad + " temizleme")) {
            return;
        }
        try {
            BufferedWriter bw = dosyaYaz(dosya, false);
            bw.write("");
            bw.close();
            JOptionPane.showMessageDialog(this, ad + " temizlendi.");
            tablolariYenile();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Dosya temizlenemedi.");
        }
    }

    private void dosyalariHazirla() {
        new File(resimKlasoru).mkdirs();
        new File(txtKlasoru).mkdirs();
        dosyaYoksaOlustur(kelimeDosyasi);
        dosyaYoksaOlustur(sifreDosyasi);
        dosyaYoksaOlustur(logDosyasi);
        dosyaYoksaOlustur(oyunDosyasi);
        kelimeDosyasiBossaDoldur();
    }

    private void dosyaYoksaOlustur(String yol) {
        try {
            File dosya = new File(yol);
            if (!dosya.exists()) {
                dosya.createNewFile();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, yol + " olusturulamadi.");
        }
    }

    private void kelimeDosyasiBossaDoldur() {
        if (new File(kelimeDosyasi).length() > 0) {
            return;
        }
        String[] varsayilan = {
            "bilgisayar", "programlama", "kutuphane", "algoritma", "degisken",
            "donguler", "metotlar", "nesneler", "siniflar", "kalitim",
            "arayuz", "veritabani", "internet", "klavye", "monitor",
            "uygulama", "tasarim", "pencere", "butonlar", "tablolar",
            "dosyalar", "sifreleme", "rastgele", "zamanlayici", "etiketler",
            "tahmin", "kelimeler", "kayitlar", "sonuclar", "basarili"
        };
        try {
            BufferedWriter bw = dosyaYaz(kelimeDosyasi, false);
            for (int i = 0; i < varsayilan.length; i++) {
                bw.write(varsayilan[i]);
                bw.newLine();
            }
            bw.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Varsayilan kelimeler yazilamadi.");
        }
    }

    private String sifreOku() {
        try {
            BufferedReader br = dosyaOku(sifreDosyasi);
            String sifre = br.readLine();
            br.close();
            return sifre == null ? "" : sifre.trim();
        } catch (Exception ex) {
            return "";
        }
    }

    private void sifreYaz(String sifre) {
        try {
            BufferedWriter bw = dosyaYaz(sifreDosyasi, false);
            bw.write(sifre);
            bw.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sifre yazilamadi.");
        }
    }

    private void logYaz(String etiket, String aciklama) {
        try {
            BufferedWriter bw = dosyaYaz(logDosyasi, true);
            bw.write(tarih.format(new Date()) + "|" + etiket + "|" + aciklama);
            bw.newLine();
            bw.close();
        } catch (Exception ex) {
        }
    }

    private void oyunKaydiYaz(String sonuc) {
        try {
            BufferedWriter bw = dosyaYaz(oyunDosyasi, true);
            bw.write(tarih.format(new Date()) + "|" + sure + "|" + sonuc + "|" + secilenKelime);
            bw.newLine();
            bw.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Oyun kaydi yazilamadi.");
        }
    }

    private BufferedReader dosyaOku(String yol) throws Exception {
        return new BufferedReader(new InputStreamReader(new FileInputStream(yol), "UTF-8"));
    }

    private BufferedWriter dosyaYaz(String yol, boolean ekle) throws Exception {
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(yol, ekle), "UTF-8"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBasla;
    private javax.swing.JButton btnHarf;
    private javax.swing.JButton btnKelime;
    private javax.swing.JButton btnLogTemizle;
    private javax.swing.JButton btnLogYenile;
    private javax.swing.JButton btnSkorTemizle;
    private javax.swing.JButton btnSkorYenile;
    private javax.swing.JButton btnYenidenBaslat;
    private javax.swing.JMenuItem itemBasla;
    private javax.swing.JMenuItem itemCikis;
    private javax.swing.JMenuItem itemTablolariYenile;
    private javax.swing.JMenuItem itemYenidenBaslat;
    private javax.swing.JLabel lblDurum;
    private javax.swing.JLabel lblHak;
    private javax.swing.JLabel lblHarfTahmini;
    private javax.swing.JLabel lblKelimeTahmini;
    private javax.swing.JLabel lblResim;
    private javax.swing.JLabel lblSure;
    private javax.swing.JLabel lblTahminler;
    private javax.swing.JPopupMenu.Separator menuAyirici;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuKayitlar;
    private javax.swing.JMenu menuOyun;
    private javax.swing.JPanel pnlAlfabe;
    private javax.swing.JPanel pnlBilgi;
    private javax.swing.JPanel pnlKelime;
    private javax.swing.JPanel pnlLogButon;
    private javax.swing.JPanel pnlLogTab;
    private javax.swing.JPanel pnlOrta;
    private javax.swing.JPanel pnlOyunButon;
    private javax.swing.JPanel pnlOyunTab;
    private javax.swing.JPanel pnlSag;
    private javax.swing.JPanel pnlSkorButon;
    private javax.swing.JPanel pnlSkorTab;
    private javax.swing.JPanel pnlSol;
    private javax.swing.JPanel pnlTahmin;
    private javax.swing.JPanel pnlUst;
    private javax.swing.JScrollPane scrollLog;
    private javax.swing.JScrollPane scrollSkor;
    private javax.swing.JTabbedPane tablar;
    private javax.swing.JTable tblLoglar;
    private javax.swing.JTable tblSkorlar;
    private javax.swing.JTextField txtHarf;
    private javax.swing.JTextField txtKelime;
    // End of variables declaration//GEN-END:variables
}
