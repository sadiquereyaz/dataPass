package `in`.instea.passingvalue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val receivedText = intent.getStringExtra(MainActivity.KEY)
        Toast.makeText(this, receivedText, Toast.LENGTH_LONG).show()
    }
}