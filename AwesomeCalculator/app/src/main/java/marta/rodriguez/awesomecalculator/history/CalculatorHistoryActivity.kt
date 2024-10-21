package marta.rodriguez.awesomecalculator.history

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import marta.rodriguez.awesomecalculator.R
import marta.rodriguez.awesomecalculator.databinding.ActivityCalculatorHistoryBinding

class CalculatorHistoryActivity : AppCompatActivity() {
    companion object {
        const val HISTORY_LIST = "history_list_key"

        fun getCallingIntent(context : Context, historyArrayList : ArrayList<OperationRecord>) : Intent {
            val intent = Intent(context, CalculatorHistoryActivity::class.java)
            intent.putParcelableArrayListExtra(HISTORY_LIST, historyArrayList)
            return intent
        }
    }

    private lateinit var binding: ActivityCalculatorHistoryBinding

    private val viewPadding = 15

    private var historyOperations : ArrayList<OperationRecord> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityCalculatorHistoryBinding.inflate(layoutInflater)
        setContentView(binding.main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left + viewPadding, systemBars.top + viewPadding, systemBars.right + viewPadding, systemBars.bottom + viewPadding)
            insets
        }
    }
}