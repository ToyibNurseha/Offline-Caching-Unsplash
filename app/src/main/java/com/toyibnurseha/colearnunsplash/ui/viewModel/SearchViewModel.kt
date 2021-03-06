package com.toyibnurseha.colearnunsplash.ui.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.toyibnurseha.colearnunsplash.data.source.Resource
import com.toyibnurseha.colearnunsplash.domain.model.SearchModel
import com.toyibnurseha.colearnunsplash.domain.model.UnsplashModel
import com.toyibnurseha.colearnunsplash.domain.usecase.UnsplashUseCase

class SearchViewModel(private val unsplashUseCase: UnsplashUseCase) : ViewModel() {

    fun getSearch(query: String, colorSort: String? = null, orientation: String? = null, page: Int): LiveData<Resource<SearchModel>> =
        unsplashUseCase.getSearch(query, colorSort = colorSort, orientation = orientation, page = page).asLiveData()
}