package com.mersiades.awcdata.models;

public class Game {

    /*
     * textChannelId is provided by Discord when the Game's channels are created.
     * textChannelId acts as the Game's id
     */
    private Long textChannelId;
    /* textChannelId is provided by Discord when the Game's channels are created. */
    private Long voiceChannelId;
    private String name;

    public Game(Long textChannelId, Long voiceChannelId, String name) {
        this.textChannelId = textChannelId;
        this.voiceChannelId = voiceChannelId;
        this.name = name;
    }

    public Long getTextChannelId() {
        return textChannelId;
    }

    public Long getVoiceChannelId() {
        return voiceChannelId;
    }

    public String getName() {
        return name;
    }
}
