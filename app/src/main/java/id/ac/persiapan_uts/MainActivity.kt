package id.ac.persiapan_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.bali,"Genggong","1",
                "Genggong adalah alat musik Bali yang mengeluarkan suara khas dan unik. Agar menghasilkan suara " +
                "genggong dimainkan dengan cara ditiup bagian yang disebut dengan palayah. Caranya, pegang ujung alat sebelah kiri menggunakan tangan kiri, dan gunakan tangan kanan untuk memegang tangkai bambu"))

        data?.add(DataModel(R.drawable.jateng,"Bonang","2",
                "Bonang adalah alat musik pukul yang terbuat dari logam-logam seperti kuningan, perunggu, atau besi. " +
                " Cara memainkannya, bonang dipukul menggunakan pemukul khusus yang terbuat dari kayu yang dilapisi dengan kain atau karet"))

        data?.add(DataModel(R.drawable.jatim,"Terompet reog","3",
                "Terompet reog merupakan alat musik Jawa Timur yang digunakan dalam kesenian reog." +
                "Terbuat dari kayu dengan bentuk mengerucut seperti terompet pada umumnya. Pada bagian memanjang seperti suling."))

        data?.add(DataModel(R.drawable.kalteng,"Gandang ","4",
                "Gandang Tatau adalah salah satu alat musik tradisional pada masyarakat Dayak yang bermukim di sekitar aliran Sungai Kahayan dan dikenal" +
                "pula oleh masyarakat Dayak pada umumnya di Provinsi Kalimantan Tengah."))

        data?.add(DataModel(R.drawable.ntt,"Heo","5",
                "Heo adalah alat music dari ntt yang dimainkan dengan cara seperti biola." +
                "Heo terbuat dari papan kayu dan empat senar atau dawai yang memiliki nada dasar berbeda."))

        data?.add(DataModel(R.drawable.sulteng,"Pare'e ","6",
                "Pare'e adalah semacam alat musik pukul yang terbuat dari bambu yang dibelah, dan salah satu ujungnya dibuat runcing seperti bentuk paruh burung." +
                "Cara memainkannya dengan dipukul menggunakan tangan, dan berasal dari sulteng"))

        data?.add(DataModel(R.drawable.banten,"Dogdog Lojor","7",
                "Dogdog Lojor adalah salah satu alat musik tradisional yang berasal dari daerah selatan (banten)." +
                " Alat musik satu ini memiliki bentuk seperti bedug, hanya saja memiliki Banten bentuk yang lebih kecil dan memanjang."))


        data?.add(DataModel(R.drawable.jabar,"celempung","8",
                "celempung adalah alat musik dari jabar yang dimainkan petik di dalam gamelan Jawa. Ada hubungannya juga dengan kecapi di gamelan Sunda." +
                "Siter dan celempung masing-masing memiliki 11 dan 13 pasang senar, direntang kedua sisinya di antara kotak resonator."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.nomer)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }
        })
    }
}