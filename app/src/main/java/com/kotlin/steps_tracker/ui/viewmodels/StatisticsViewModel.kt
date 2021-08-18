package com.kotlin.steps_tracker.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.kotlin.steps_tracker.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by Vishakha Sharma on 23-07-2021.
 */
@HiltViewModel
class StatisticsViewModel @Inject constructor(val mainRepository: MainRepository) : ViewModel() {
}