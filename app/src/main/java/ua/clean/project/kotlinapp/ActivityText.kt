package ua.clean.project.kotlinapp

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ua.clean.project.kotlinapp.BR.message
import ua.clean.project.kotlinapp.databinding.ActivityTextBinding
import ua.clean.project.kotlinapp.model.Message

class ActivityText : AppCompatActivity() {

    lateinit var binding: ActivityTextBinding
    val message = Message()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil
                .setContentView(this, R.layout.activity_text)


        binding.setVariable(BR.message, message)
        binding.setMain(this)
        binding.executePendingBindings()
    }

    fun clickButton() {
        Toast.makeText(this, "save to DB", Toast.LENGTH_SHORT).show()
    }


}
