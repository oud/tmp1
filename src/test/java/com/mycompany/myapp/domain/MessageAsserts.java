package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class MessageAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMessageAllPropertiesEquals(Message expected, Message actual) {
        assertMessageAutoGeneratedPropertiesEquals(expected, actual);
        assertMessageAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMessageAllUpdatablePropertiesEquals(Message expected, Message actual) {
        assertMessageUpdatableFieldsEquals(expected, actual);
        assertMessageUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMessageAutoGeneratedPropertiesEquals(Message expected, Message actual) {
        assertThat(actual)
            .as("Verify Message auto generated properties")
            .satisfies(a -> assertThat(a.getId()).as("check id").isEqualTo(expected.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMessageUpdatableFieldsEquals(Message expected, Message actual) {
        assertThat(actual)
            .as("Verify Message relevant properties")
            .satisfies(a -> assertThat(a.getPriority()).as("check priority").isEqualTo(expected.getPriority()))
            .satisfies(a -> assertThat(a.getTopic()).as("check topic").isEqualTo(expected.getTopic()))
            .satisfies(a -> assertThat(a.getData()).as("check data").isEqualTo(expected.getData()))
            .satisfies(a -> assertThat(a.getStatus()).as("check status").isEqualTo(expected.getStatus()))
            .satisfies(a -> assertThat(a.getReceivedAt()).as("check receivedAt").isEqualTo(expected.getReceivedAt()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMessageUpdatableRelationshipsEquals(Message expected, Message actual) {
        // empty method
    }
}
