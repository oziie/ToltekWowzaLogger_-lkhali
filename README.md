# ToltekWowzaMongoDBLogger

Wowza Streaming üzerinde oluşturulan live bir uygulamada uygulamanın adını alıp MongoDB veritabanına yazan bir projedir.

Wowza Streaming Engine Project olarak Eclipse IDE üzerinde yazılmış bir projedir.

### WOWZA MEDİA SYSTEMS-BAŞLARKEN:

Wowza Media System hakkında en detaylı bilgileri kendi dökümantasyonlarından ulaşabilirsiniz:

https://www.wowza.com/docs

Wowza Streaming üzerinde çalışan live bir uygulamada Java kodlarımızı çalıştırma için yapmanız gerekenler bu linkte bulunmaktadır:

https://www.wowza.com/docs/How-to-extend-Wowza-Streaming-Engine-using-Java

Bu linkteki gibi Wowza Streaming Engine Manager üzerinde live uygulamanıza "Modules" kısmında Java classlarınızı ve kullanacağınız kütüphaneleri eklemeniz gerekmektedir.

Java kodunun çalışması için MongoDB kütüphanesini projemize import etmeliyiz.Aşağıdaki linkten gerekli jar dosyasını bulabilirsiniz:

https://oss.sonatype.org/content/repositories/releases/org/mongodb/mongo-java-driver/3.5.0/mongo-java-driver-3.5.0.jar

NOT:Bu jar dosyasını Ayrıca Wowza'nın kurulu olduğu klasörün (default olarak "Program Files" içerisinde "Wowza Media Systems") içerisindeki "lib" klasörüne atmanız gerekmektedir.

NOT:"Modules" kısmını görebilmek için "Server-Users" kısmında "Admin" kullanıcısının yetkilerini açmalısınız.Bunu için "Actions" kısmında
"Preferences" altında "Allow access to advanced properties and features" check box'ı seçilip kaydedilmelidir.Bundan sonra "Access Level" 'de  "Admin(Advanced)" olarak görülmelidir.

NOT:Eclipse Üzerinde "Access Denied" veya "Erişim Engellendi" hataları için hata loglarına göre dosyalara "Everyone" olarak dosya izinleri verirseniz bu hataları giderebilirsiniz.

### MONGODB-BAŞLARKEN:

Aşağıdaki linklerden MongoDB kurulumu ve kullanımı hakkında detaylı bilgiyi edinebilirsiniz:

Kurulum:

https://www.youtube.com/watch?v=HWAWRHizwwg

MongoDB hakkında bilgiler:

https://www.tutorialspoint.com/mongodb/

https://www.tutorialspoint.com/mongodb/mongodb_java.htm

MongoDB veritabanını görüntülemek için Robo3T aracını kullanabilirsiniz:

https://robomongo.org/





