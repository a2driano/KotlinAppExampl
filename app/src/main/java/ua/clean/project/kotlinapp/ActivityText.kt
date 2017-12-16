package ua.clean.project.kotlinapp

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ua.clean.project.kotlinapp.databinding.ActivityTextBinding
import ua.clean.project.kotlinapp.model.Message

class ActivityText : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_text)
        val binding: ActivityTextBinding = DataBindingUtil
                .setContentView(this, R.layout.activity_text)

        val message = Message("sdf")
        binding.setVariable(BR.message, message)
        binding.executePendingBindings()
    }
}
