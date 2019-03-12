package com.example.android.kotlincoroutines

import com.example.android.kotlincoroutines.main.MainViewModel
import com.example.android.kotlincoroutines.main.TitleRepository
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import kotlinx.coroutines.runBlocking
import org.junit.Test

class MainViewModelUnitTest {

    private val repo: TitleRepository = mock()
    private val viewModel = MainViewModel(repo)

    @Test
    fun testRepository() = runBlocking {
        viewModel.onMainViewClicked()
        verify(repo).refreshTitle()
    }
}
