package br.com.cotemig.zeplinrecliclerview.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import br.com.cotemig.zeplinrecliclerview.R
import br.com.cotemig.zeplinrecliclerview.models.Tutorial
import br.com.cotemig.zeplinrecliclerview.ui.adapters.AdapterTutorial
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_tutorial.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listTutorial: List<Tutorial> = listOf(
            Tutorial(
                null,
                resources.getString(R.string.tutorial_main_1),
                resources.getString(R.string.tutorial_sub_1)),
            Tutorial(
                null,
                resources.getString(R.string.tutorial_main_2),
                resources.getString(R.string.tutorial_sub_2)),
            Tutorial(
                null,
                resources.getString(R.string.tutorial_main_3),
                resources.getString(R.string.tutorial_sub_3))
        )

        val context = this@MainActivity
        tutorial.adapter = AdapterTutorial(context, listTutorial)
        tutorial.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(tutorial)
    }
}
