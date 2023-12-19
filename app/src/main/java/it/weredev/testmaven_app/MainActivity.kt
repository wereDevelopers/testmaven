package it.weredev.testmaven_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import it.weredev.testmaven.Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val test1 = Utils.TEST_1
        println(test1)
    }
}