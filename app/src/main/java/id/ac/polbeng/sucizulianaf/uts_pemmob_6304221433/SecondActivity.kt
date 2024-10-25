package id.ac.polbeng.sucizulianaf.uts_pemmob_6304221433

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.sucizulianaf.uts_pemmob_6304221433.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val luasKubus = intent.getDoubleExtra("luas_kubus", 0.0)
        val volumeKubus = intent.getDoubleExtra("volume_kubus", 0.0)

        binding.textView.text = "Luas Kubus: %.2f\nVolume Kubus: %.2f".format(luasKubus, volumeKubus)
    }
}
