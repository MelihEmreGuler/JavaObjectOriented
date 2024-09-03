# Section 7: Diziler

## 38. Diziler - Tanımlama ve Erişim

- Bütün dillerde olduğu gibi Java da da birden fazla ilkel değişkeni ya da referansı yönetmeyi sağlayan torba (collection) yapıları vardır.
- Java’ nın util paketinde yetenekli bir **torba çerçevesi (collection framework)** vardır.
    - Bu torbaları ileride ayrı bir bölümde ele alacağız.
    - Bu torbalardan ilk olarak en temeli olan, diziler (arrays) ele alacağız.
- Dizilerin 2 tane kısıtı vardır:
    - Uzunlukları sabittir ve bu bilgi dizi oluşturulurken verilmelidir.
    - Homojen veri yapılarıdır, aynı tipten verileri tutarlar.
- `[]` işaretinin nerede olduğunun önemi yoktur, tipten ya da referanstan sonra olabilir.
    - Yaygın kullanım tipten sonra olmasıdır.
- Dizi oluşturulurken kurucu çağrısı yapılmaz, bu çağrıyı JVM halleder.
    
    ![Screenshot 2024-07-28 at 7.03.41 PM.png](media/Screenshot_2024-07-28_at_7.03.41_PM.png)
    

![Untitled](media/Untitled.png)

- Bir dizi oluşturulduğunda, odalarındaki elemanlar, dizinin tipinin varsayılan değerleri ile doldurulur.
    - Bu değer boolean için false, diğer 7 sayısal ilkel tip için 0’ ın bir türüdür.
    - Referans tipler için ise varsayılan değer null’ dur.

![Untitled](media/Untitled%201.png)

![Untitled](media/Untitled%202.png)

### 39. Dizilerde For Each

![Untitled](media/Untitled%203.png)

- foreach yapısı atama yapmak için kullanılamaz. read only dir.

![Untitled](media/Untitled%204.png)

### 40. Çok Boyutlu Diziler

![Untitled](media/Untitled%205.png)

- Neden sadece ilk boyuta length bilgisi vermek zorundayız?

Çünkü eğer 2. veya 3. boyuta da uzunluk verirsek onların hepsinin uzunluğu aynı olmak zoruda kalır. Bu da matris üretiyoruz demektir. Matris üretmek zorunda değiliz. Farklı farklı boyutlarda olmasını istiyorsak iç boyutlara uzunluk ataması yapmamıza gerek yok.

![Untitled](media/Untitled%206.png)

![Untitled](media/Untitled%207.png)

### 42. Main Metoda Parametre Geçme

![Untitled](media/Untitled%208.png)

![Untitled](media/Untitled%209.png)

```java
 Integer.parseInt(args[2]); // ile tip dönüşümleri yapabiliyoruz
```