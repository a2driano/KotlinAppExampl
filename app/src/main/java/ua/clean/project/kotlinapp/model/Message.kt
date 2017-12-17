package ua.clean.project.kotlinapp.model

import android.databinding.BaseObservable
import android.databinding.Bindable
import ua.clean.project.kotlinapp.BR

/**
 * Created by kunde on 13.12.2017.
 */
class Message : BaseObservable() {

    @get:Bindable
    @set:Bindable
    var post: String? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.post)
        }
}

