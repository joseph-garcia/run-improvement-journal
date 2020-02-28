package com.josyf.improvementtracker.Model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculationViewModel : ViewModel() {
    //private var hourSelected : Int = 0
    val hourSelected: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
    private var minuteSelected : Int = 0
    private var secondSelected : Int = 0

    private var milesSelected : Int = 0
    private var milesTensSelected : Int = 0
    private var milesOnesSelected : Int = 0
    private var mileSelectedDecimals : Double = 0.0
    private var minutePace : Double = 0.0
    private var remainderSeconds : Double = 0.0
    private var goalDistance: Double = 1.0
    private var adjustedTimeInSeconds: Int = 0

}