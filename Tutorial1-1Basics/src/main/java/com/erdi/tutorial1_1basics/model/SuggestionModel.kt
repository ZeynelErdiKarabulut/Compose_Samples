package com.erdi.tutorial1_1basics.model

data class SuggestionModel(val tag: String) {
    val id = tag.hashCode()
}
