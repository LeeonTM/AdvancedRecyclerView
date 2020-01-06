package com.leontimmerman.advancedrecyclerview.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.leontimmerman.advancedrecyclerview.data.ColorRepository
import com.leontimmerman.advancedrecyclerview.model.ColorItem

class MainActivityViewModel : ViewModel(){
    private val colorRepository = ColorRepository()

    val colorItems = MutableLiveData<List<ColorItem>>().apply {
        value = colorRepository.getColorItems()
    }
}
