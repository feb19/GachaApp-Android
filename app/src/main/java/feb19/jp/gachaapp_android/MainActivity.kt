package feb19.jp.gachaapp_android

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonId = R.id.button
        val button = findViewById<Button>(buttonId)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        button.setOnClickListener {

            val results = arrayOf("S+", "S", "A+", "A", "B", "C")
            val n = Random().nextInt(results.count())
            Log.v("MainActivity", n.toString())

            if (n <= 1) {
                resultTextView.setTextColor(Color.RED)
            } else {
                resultTextView.setTextColor(Color.parseColor("#666666"))
            }
            resultTextView.text = results.get(n)
        }
    }
}
