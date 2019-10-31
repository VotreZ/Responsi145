package com.example.responsi145

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class Home : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        listView = findViewById(R.id.ListView)
        var list = mutableListOf<Model>()

        list.add(Model("Flashdisk",   "Untuk Menyimpan Data Seperti Hardisk Berukuran Kecil",   R.drawable.flashdisk  ))
        list.add(Model("Smartphone",   "Alat Komunikasi Pintar",   R.drawable.hp  ))
        list.add(Model("Kabel Data", "Digunakan Untuk Mengisi Daya Smartphone", R.drawable.kabel  ))
        list.add(Model("Kamera",  "Alat Untuk Mengambil Gambar",  R.drawable.kamera  ))
        list.add(Model("Keyboard",  "Alat Mengetik Untuk Komputer Atau Laptop",  R.drawable.keyboard  ))
        list.add(Model("Komputer",  "Perangkat Keras Yang Bisa Digunakan Untuk Apa Saja",  R.drawable.komputer  ))
        list.add(Model("Laptop",  "Sama Seperti Komputer Tetapi Berukuran Lebih Kecil",  R.drawable.laptop  ))
        list.add(Model("Monitor",  "Perangkat Keras Untuk Menampilkan Gambar Pada Komputer Atau Laptop",  R.drawable.monitor  ))
        list.add(Model("Mouse",  "Alat Untuk Menggerakkan Kursor Komputer Atau Laptop",  R.drawable.mouse  ))
        list.add(Model("Printer",  "Untuk Mencetak Dokumen",  R.drawable.printer  ))

        listView.adapter = MyListAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                Toast.makeText(this@Home, "Item Satu",   Toast.LENGTH_SHORT).show()
            }
            if (position==1){
                Toast.makeText(this@Home, "Item Dua",   Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@Home, "Item Tiga", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@Home, "Item Empat",  Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this@Home, "Item Lima",  Toast.LENGTH_SHORT).show()
            }
            if (position==5){
                Toast.makeText(this@Home, "Item Enam",  Toast.LENGTH_SHORT).show()
            }
            if (position==6){
                Toast.makeText(this@Home, "Item Tujuh",  Toast.LENGTH_SHORT).show()
            }
            if (position==7){
                Toast.makeText(this@Home, "Item Delapan",  Toast.LENGTH_SHORT).show()
            }
            if (position==8){
                Toast.makeText(this@Home, "Item Sembilan",  Toast.LENGTH_SHORT).show()
            }
            if (position==9){
                Toast.makeText(this@Home, "Item Sepuluh",  Toast.LENGTH_SHORT).show()
            }
        }
    }

}
