package com.example.android.kotlincoroutines.main

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import kotlinx.coroutines.*
import org.junit.Rule
import org.junit.Test

class MainViewModelUnitTest {

    @get:Rule
    var coroutineTestRule = CoroutinesTestRule()

    private val repo: TitleRepository = mock()

    private val viewModel = MainViewModel(repo)

    @Test
    fun testRepository() = runBlocking {
        viewModel.onMainViewClicked()
        verify(repo).refreshTitle()
    }
}