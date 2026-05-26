# Adam Asmaca Oyunu

Bu proje Programlama Dilleri II dersi icin Java Swing kullanarak yaptigim Adam Asmaca oyunudur.
Oyunda sifre girisi, kelime tahmini, harf tahmini, skor kaydi ve log kaydi gibi bolumler bulunmaktadir.

Projeyi GitHub'a yuklerken ana proje klasoru olarak `mavenproject3` klasoru kullanilabilir.

## Oyunda Neler Var?

- Program acilirken once sifre kontrolu yapilir.
- Daha once sifre belirlenmediyse kullanicidan yeni sifre alinir ve `sifre.txt` dosyasina kaydedilir.
- Sifre varsa kullaniciya 3 deneme hakki verilir.
- Sifre girisleri ve program hareketleri `log.txt` dosyasina tarih ve saat ile yazilir.
- Ust menude `Oyuna Basla`, `Yeniden Baslat` ve cikis gibi secenekler vardir.
- Oyun ekrani `JTabbedPane` ile 3 sekmeye ayrilmistir:
  - Oyun Oynama
  - Eski Skorlar
  - Loglar
- Oyun baslayinca rastgele bir kelime secilir.
- Secilen kelimenin harf sayisi kadar ekrana `JLabel` eklenir ve baslangicta harfler `*` olarak gorunur.
- Harf tahmini ve kelime tahmini icin iki ayri `JTextField` bulunur.
- Harfler ustteki alfabe butonlarindan da secilebilir.
- Turkce alfabede olmayan `Q`, `W`, `X` harfleri ekranda soluk ve pasif olarak gosterilir.
- Yanlis tahminlerde `1.jpg` ile `11.jpg` arasindaki resimler sirayla gosterilir.
- 11 yanlis tahminde oyun kaybedilir.
- Oyun suresi saniye olarak tutulur.
- Oyun bitince sonuc, sure, tarih ve kelime `oyunlar.txt` dosyasina kaydedilir.
- Eski skorlar ve loglar tablolarda `JTable` ile gosterilir.
- Skor ve log dosyalari sifre dogrulamasi yapildiktan sonra temizlenebilir.
- Kurallari tekrar gostermek icin `Kurallar` butonu vardir.
- 10. yanlis tahminden sonra oyuncu isterse ipucu alabilir.

## Dosya Yapisi

Program dosyalari asagidaki klasor yapisini kullanir:

```text
C:\P2Oyun
|-- Resimler
|   |-- 1.jpg
|   |-- 2.jpg
|   |-- ...
|   |-- 11.jpg
|-- TXTDosyalar
    |-- kelimeler.txt
    |-- log.txt
    |-- oyunlar.txt
    |-- sifre.txt
```

## kelimeler.txt
```text
Kutuphane;Kitaplarla ilgili bir yer
Bilgisayar;Klavye ve ekranla kullanilir
```

Noktali virgulden onceki kisim kelime olarak, sonraki kisim ipucu olarak kullanilir.
Kelime 6 harften kisa ise oyuna eklenmez.

## Kullandigim Yapilar

- Java
- Swing
- JFrame
- JPanel
- JButton
- JLabel
- JTextField
- JTabbedPane
- JTable
- JMenuBar
- Timer
- ActionListener
- BufferedReader ve BufferedWriter
- Dosya okuma ve dosya yazma islemleri

## Projeyi Calistirma

Proje NetBeans ile acilip calistirilabilir.

Ana form sinifi:

```text
adamasmaca.AdamAsmacaForm
```

NetBeans farkli bir ana sinif isterse bu sinif da oyunu baslatir:

```text
adamasmaca.AdamAsmacaApp
```

## NetBeans Design Kismi

Arayuz icin NetBeans form dosyasi da eklenmistir.

```text
src/main/java/adamasmaca/AdamAsmacaForm.java
src/main/java/adamasmaca/AdamAsmacaForm.form
```

NetBeans uzerinden `AdamAsmacaForm.java` dosyasi acilip `Design` sekmesinden arayuz gorulebilir.
Alfabe butonlari form dosyasinda vardir. Kelime kutulari ise oyun baslayinca secilen kelimeye gore kod tarafinda olusturulur.
