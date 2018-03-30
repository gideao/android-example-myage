package co.gideao.myage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pressCalculateEvent(view: View) {
        var year: Int = ageTextEdit.text.toString().toInt()
        var age: Int = Calendar.getInstance().get(Calendar.YEAR) - year
        ageTextView.text = age.toString()
    }
}
