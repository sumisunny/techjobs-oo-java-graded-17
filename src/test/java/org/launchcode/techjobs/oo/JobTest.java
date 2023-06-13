package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

    public class JobTest {
        //TODO: Create your unit tests here
        @Test
        public void testSettingJobId() {
            Job job1 = new Job();
            Job job2 = new Job();

            // Use assertNotEquals to verify that the IDs of the two objects are distinct
            assertNotEquals(job1.getId(), job2.getId());
        }

        @Test
        public void testJobConstructorSetsAllFields() {
            Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                    new PositionType("Quality control"), new CoreCompetency("Persistence"));

            // Use assertTrue and assertEquals statements to test that the constructor correctly assigns both
            // the class and value of each field
            assertTrue(job instanceof Job);
            assertEquals("Product tester", job.getName());
            assertEquals("ACME", job.getEmployer().getValue());
            assertEquals("Desert", job.getLocation().getValue());
            assertEquals("Quality control", job.getPositionType().getValue());
            assertEquals("Persistence", job.getCoreCompetency().getValue());
        }

        @Test
        public void testJobsForEquality() {
            // Generate two Job objects that have identical field values EXCEPT for id
            Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                    new PositionType("Quality control"), new CoreCompetency("Persistence"));

            Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                    new PositionType("Quality control"), new CoreCompetency("Persistence"));

            // Test that equals returns false
            assertFalse(job1.equals(job2));
        }

        @Test
        public void testToStringStartsAndEndsWithNewLine() {
            // Create a Job object with a valid name
            Job job = new Job("Test Job", new Employer("ACME"), new Location("Desert"),
                    new PositionType("Quality control"), new CoreCompetency("Persistence"));

            String jobString = job.toString();

            // Check that the string starts and ends with a newline character
            assertTrue(jobString.startsWith("\n"));
            assertTrue(jobString.endsWith("\n"));
        }

        @Test
        public void testToStringContainsCorrectLabelsAndData() {
            Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                    new PositionType("Quality control"), new CoreCompetency("Persistence"));

            String jobString = job.toString();

            assertTrue(jobString.contains("\nID: " + job.getId()));
            assertTrue(jobString.contains("\nName: Product tester"));
            assertTrue(jobString.contains("\nEmployer: ACME"));
            assertTrue(jobString.contains("\nLocation: Desert"));
            assertTrue(jobString.contains("\nPosition Type: Quality control"));
            assertTrue(jobString.contains("\nCore Competency: Persistence"));
        }
        @Test
        public void testToStringHandlesEmptyField() {
            Job job = new Job("", new Employer(""), new Location(""),
                    new PositionType(""), new CoreCompetency(""));

            String jobString = job.toString();

            assertTrue(jobString.contains("\nName: Data not available"));
            assertTrue(jobString.contains("\nEmployer: Data not available"));
            assertTrue(jobString.contains("\nLocation: Data not available"));
            assertTrue(jobString.contains("\nPosition Type: Data not available"));
            assertTrue(jobString.contains("\nCore Competency: Data not available"));
        }

    }


