package academy.mindswap.Monsters;

public enum MonsterType {
    MUMMY("Mummy"),
    VAMPIRE("Vampire"),
    WEREWOLF("Werewolf");

    private final String description;

    MonsterType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
