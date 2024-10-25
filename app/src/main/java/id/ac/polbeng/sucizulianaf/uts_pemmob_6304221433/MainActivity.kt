package id.ac.polbeng.sucizulianaf.uts_pemmob_6304221433

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.sucizulianaf.uts_pemmob_6304221433.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val sisi = binding.editText.text.toString().toDoubleOrNull()

            if (sisi != null) {
                val luasKubus = 6 * sisi * sisi
                val volumeKubus = sisi * sisi * sisi

                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra("luas_kubus", luasKubus)
                intent.putExtra("volume_kubus", volumeKubus)
                startActivity(intent)
            } else {
                binding.editText.error = "Masukkan angka yang valid"
            }
        }
    }
}
