package com.example.bloder.rxmvp.home.representers

import com.example.bloder.rxmvp.rx.Cloud

/**
 * Created by bloder on 20/05/17.
 */
sealed class FoodPresenterRepresenter : Cloud.Representer {

    object FetchFood : FoodPresenterRepresenter()
    object FetchDesserts : FoodPresenterRepresenter()
}