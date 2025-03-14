package me.misik.api.domain

import jakarta.persistence.*
import me.misik.api.domain.converter.ListToStringConverter

@Embeddable
class RequestPrompt(
    @Enumerated(EnumType.STRING)
    @Column(name = "style", nullable = false, columnDefinition = "VARCHAR(20)")
    val style: Style,

    @Column(name = "ocr_text", columnDefinition = "TEXT", nullable = false)
    val ocrText: String,

    @Column(name = "prompt_command", columnDefinition = "TEXT", nullable = false)
    val promptCommand: String,

    @Column(name = "hash_tags", columnDefinition = "TEXT", nullable = false)
    @Convert(converter = ListToStringConverter::class)
    val hashTags: List<String>,
) {

}
