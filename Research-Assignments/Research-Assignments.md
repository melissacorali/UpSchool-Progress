
# Araştırma Ödevi 1 
- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?

# Cevap:
Lateinit geç başlatma anlamına gelir. Yapıcıda bir değişken başlatmak istemiyorsanız, onu daha sonra başlatmak istiyorsanız ve
kullanmadan önce başlatmayı garanti edebiliyorsanız, o değişkeni lateinit anahtar kelimesiyle bildirin. Başlatılana kadar bellek ayırmaz
Böylelikle Null-safe’de yapmış oluyoruz. Lateinit sadece var olan değişkenlerde kullanılır. Böyle olmasının sebebi; Bytecode seviyesinde final
olarak tanımlanmaması gerekiyor, çünkü constructorda değil, sonrasında tanımlaması yapılıyor.

class MainActivity : AppCompatActivity() {

    private lateinit var text1: TextView
    private lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.button)
        text1=findViewById(R.id.textView)
        
        

# Araştırma Ödevi 2
- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ?
# Cevaplar:
XMl, insanlar ve bilgi işletim sistemleri tarafından kolayca okunabilir dökümanlar hazırlamaya yarayan bir işaretleme dilidir.
XMl dosyasında namespace kullanmamızın temel amacı, Uygulamanın xml tarafındaki değşikliklerini anlık olarak, derlenmeden görülmesini sağlar. 
xmlns:tools="http://schemas.android.com/tools" > şeklinde kullanabiliriz.

# Araştırma Ödevi 3
- Font family dosyası nasıl oluşturulup kullanıyoruz?
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?
# Cevaplar:

Font kaynağı, uygulamamızda istediğimiz çeşitlilikte yazı tipi kullanabilmemizi sağlar.Yazı tipi kaynaklarına yeni bir kaynak türü yardımıyla erişebiliriz. Font kaynağı kullanabilmemiz için öncelikle bulduğumuz ttf ve ya otf fontları projeye eklemeliyiz. Eklemek için öncelikle;
- res klasörüne sağ tıklayın ve Yeni > Android kaynak dizini'ne gidin .
Yeni Kaynak Dizini penceresi görünür.
-Resource file listesinde yazı tipini seçip tamam deriz.
-yazı tipi dosyalarımızı font klasörüne ekleriz.


![Ekran Görüntüsü (12)](https://user-images.githubusercontent.com/55882459/165592467-eb7891a9-cda2-4df0-8b03-38687e3370e7.png)

Font.xml dosyamızda fontu seçerek istediğimiz özellikleri verebiliriz.
```xml
<?xml version="1.0" encoding="utf-8"?>
<font-family xmlns:android="http://schemas.android.com/apk/res/android">
    <font
        android:fontStyle="normal"
        android:font="@font/Papernotes"
        android:fontWeight="400" />

</font-family>
```
![Ekran Görüntüsü (11)](https://user-images.githubusercontent.com/55882459/165593063-93e12505-3e77-4b60-8e12-529201e5b351.png)

# Araştırma Ödevi 4
- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız
# Cevaplar:
Animasyonlar, kullanıcıları uygulamanızda olup bitenler hakkında bilgilendiren görsel ipuçları ekleyebilir.

Property Animation: belirli bir süre boyunca bir nesnenin özellik değerlerini değiştirerek bir animasyon oluşturur.

objectAnimator: ValueAnimator'ın bir alt sınıfıdır. Belirli bir süre boyunca bir nesnenin belirli bir özelliğini canlandırır. Bir başlangıç ve bitiş değeri vererek bu aralıkta animasyon uygulayabiliriz.


