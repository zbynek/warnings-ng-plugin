package io.jenkins.plugins.analysis.warnings;

import org.kohsuke.stapler.DataBoundConstructor;
import org.jenkinsci.Symbol;
import hudson.Extension;

import io.jenkins.plugins.analysis.core.model.AnalysisModelParser;

/**
 * Provides a parser and customized messages for Polyspace tool.
 *
 * @author Eva Habeeb
 */
public class PolyspaceParse extends AnalysisModelParser {
    private static final long serialVersionUID = 5776036181982740586L;
    private static final String ID = "polyspace-parser";

    /** Creates a new instance of {@link PolyspaceParse}. */
    @DataBoundConstructor
    public PolyspaceParse() {
        super();
        // empty constructor required for stapler
    }

    /** Descriptor for this static analysis tool. */
    @Symbol("polyspaceParser")
    @Extension
    public static class Descriptor extends AnalysisModelParserDescriptor {
        /** Creates the descriptor instance. */
        public Descriptor() {
            super(ID);
        }

    }
}
