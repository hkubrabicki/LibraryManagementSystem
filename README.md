
# Kütüphane Yönetim Sistemi (Library Management System)

Bu proje, temel nesne yönelimli programlama (OOP) prensiplerini kullanarak geliştirilmiş, geniş kapsamlı bir kütüphane yönetim simülasyonudur. Sistem; kitap envanteri, kullanıcı yetkilendirmeleri ve ödünç alma/iade etme süreçlerini uçtan uca yönetmektedir.

## 🚀 Fonksiyonel Özellikler

* 
**Kitap Yönetimi:** Sisteme yeni kitap tanımlama ve mevcut kitapların stok durumunu (kopya sayısı) dinamik olarak güncelleme.


* 
**Kullanıcı Kayıt Sistemi:** E-posta adresi üzerinden benzersiz kullanıcı tanımlama ve kayıt kontrolü.


* 
**Ödünç Alma Mantığı:** Kullanıcıların mevcut stoklar dahilinde kitap ödünç alabilmesi; her kullanıcı için eşzamanlı maksimum 3 kitap limiti.


* 
**İade Süreçleri:** Ödünç alınan kitapların iade edilmesiyle stokların otomatik senkronize edilmesi.


* 
**İşlem Geçmişi (Logs):** Yapılan her işlemin türü (Ödünç/İade), kullanıcı bilgisi, kitap detayı ve tarih bazlı olarak kayıt altına alınması.



## 🛠 Teknik Mimari ve Sınıf Yapısı

Proje, modüler bir yapı üzerine inşa edilmiş olup aşağıdaki sınıflardan oluşur:

* 
**`Book`:** Kitap meta verilerini ve stok durumunu (toplam/mevcut kopya) kapsüller.


* 
**`User`:** Kullanıcı profili oluşturur ve kullanıcıya zimmetli kitapların takibini yapar.


* 
**`Library`:** Sistemin merkezi yönetim sınıfıdır; kitap, kullanıcı ve tüm işlem verilerini koordineli şekilde yönetir.


* 
**`Transaction`:** Sistemdeki her bir hareketin (transaction) detaylı kaydını tutar.


* 
**`Main`:** Kullanıcı etkileşimini sağlayan konsol tabanlı arayüzü ve uygulama döngüsünü yönetir.



## 📊 Modelleme

Projenin nesne ilişkileri ve sistem mimarisi, **UML Class Diagram** standartlarına uygun olarak tasarlanmış ve modellenmiştir. Bu diyagram, sınıflar arasındaki ilişkilerin (association, dependency vb.) teknik dökümantasyonunu sağlar.

## 💻 Kullanılan Teknolojiler

* 
**Programlama Dili:** Java 


* **Geliştirme Yaklaşımı:** Nesne Yönelimli Programlama (OOP)
* 
**Veri Depolama:** Bellek içi (In-memory) dizi yapıları 



 
