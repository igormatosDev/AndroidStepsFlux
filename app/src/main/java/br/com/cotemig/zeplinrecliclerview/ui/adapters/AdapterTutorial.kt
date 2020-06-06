package br.com.cotemig.zeplinrecliclerview.ui.adapters
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.cotemig.zeplinrecliclerview.R
import br.com.cotemig.zeplinrecliclerview.models.Tutorial
import com.bumptech.glide.Glide

class AdapterTutorial(var context: Context, var steps: List<Tutorial>) :
    RecyclerView.Adapter<AdapterTutorial.ViewTutorial>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewTutorial {
        val view = LayoutInflater.from(context).inflate(R.layout.item_tutorial, parent, false)
        return ViewTutorial(view)
    }

    override fun getItemCount(): Int {
        return steps.size
    }

    override fun onBindViewHolder(holder: ViewTutorial, position: Int) {
        holder.bind(context, steps[position])
    }

    class ViewTutorial(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(context: Context, tutorial: Tutorial) {
            val image = itemView.findViewById<ImageView>(R.id.imagem)
            Glide.with(context).load(tutorial.image).into(image)

            itemView.findViewById<TextView>(R.id.tutorial_main_text).text = tutorial.mainText.toString()
            itemView.findViewById<TextView>(R.id.tutorial_sub_text).text = tutorial.mainText.toString()
        }
    }
}





