# Adam Asmaca Oyunu

Bu proje Programlama Dilleri II dersi icin Java Swing ile gelistirilmis bir Adam Asmaca oyunudur.

GitHub'a yuklerken proje kok klasoru olarak bu klasor secilmelidir:

```text
mavenproject3
```

## Proje Ozellikleri

- Program acilisinda sifre kontrolu yapilir.
- Sifre yoksa kullanicidan yeni sifre alinir ve `sifre.txt` dosyasina kaydedilir.
- Sifre varsa kullaniciya 3 deneme hakki verilir.
- Sifre girisi ve temizleme islemlerinde `JPasswordField` kullanilir.
- Giris ve sifre denemeleri `log.txt` dosyasina tarih-saat bilgisiyle kaydedilir.
- Oyun ekrani `JTabbedPane` uzerinde hazirlanmistir.
- Oyun oynama ekraninda rastgele kelime secilir ve harf sayisi kadar dinamik `JLabel` olusturulur.
- Harf tahmini ve kelime tahmini icin iki ayri `JTextField` kullanilir.
- Tahmin edilen harfler ekranda ayrica gosterilir.
- Harf tahmini icin tiklanabilir `JButton` tabanli alfabe paneli bulunur.
- Yanlis tahminlerde `1.jpg` ile `11.jpg` arasindaki resimler sirayla gosterilir.
- 11 yanlis tahminde oyun kaybedilir.
- Oyun suresi saniye olarak takip edilir.
- Oyun sonucu, sure, tarih ve kelime bilgisi `oyunlar.txt` dosyasina kaydedilir.
- Eski skorlar `JTable` ile listelenir.
- Log kayitlari `JTable` ile listelenir.
- Skor ve log dosyalari sifre dogrulamasi ile temizlenebilir.

## Dosya Yapisi

Program asagidaki klasorleri kullanir:

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

## Kullanilan Teknolojiler

- Java
- Swing
- JFrame
- JPanel
- JTabbedPane
- JTable
- JMenuBar
- Timer
- ActionListener / ActionPerformed
- BufferedReader / BufferedWriter
- Dosya okuma-yazma islemleri
- JPanel uzerine kurulmus oyun ve tablo panelleri

## Calistirma

Proje NetBeans ile acilip calistirilabilir.

Varsayilan ana sinif:

```text
adamasmaca.AdamAsmacaForm
```

NetBeans ana sinif olarak eski giris sinifini isterse su sinif da uygulamayi acar:

```text
adamasmaca.AdamAsmacaApp
```

## NetBeans Design Ekrani

Arayuz dosyalari NetBeans form yapisina uygundur:

```text
src/main/java/adamasmaca/AdamAsmacaForm.java
src/main/java/adamasmaca/AdamAsmacaForm.form
```

NetBeans'te `Source Packages > adamasmaca > AdamAsmacaForm.java` dosyasi acilip ustteki `Design` sekmesine gecilebilir.
Alfabe harfleri ve kelime kutulari oyun baslayinca kodla olusturulur; bu yuzden Design ekraninda o iki panel bos gorunebilir.
