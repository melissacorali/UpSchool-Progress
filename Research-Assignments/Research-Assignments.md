
# Araştırma Ödevi 1 
Lateinit neden kullanıyoruz?
Lateinit kullanımından bahseder misiniz?
Lateinit için bir örnek kullanım gösterir misiniz ?

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
Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
Neden kullanılmaktadır ?
Nasıl kullanılmalıdır ?
Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ?
# Cevaplar:
XMl, insanlar ve bilgi işletim sistemleri tarafından kolayca okunabilir dökümanlar hazırlamaya yarayan bir işaretleme dilidir.
XMl dosyasında namespace kullanmamızın temel amacı, Uygulamanın xml tarafındaki değşikliklerini anlık olarak, derlenmeden görülmesini sağlar. 
xmlns:tools="http://schemas.android.com/tools" > şeklinde kullanabiliriz.
