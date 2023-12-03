package org.example;

import java.util.Optional;

public class Progress {
    private Optional<Tutor> tutor = Optional.empty();

    public void setTutor(Tutor tutor) {
        this.tutor = Optional.of(tutor);
    }

    public Optional<Tutor> getTutor() {
        return tutor;
    }

    public void monitorProgress() {
        if(!tutor.isPresent()) {
            throw new IllegalStateException("Tutor is not present!");
        }
        System.out.println("progress is monitored by: " + tutor.get().getNickname());
    }
}
