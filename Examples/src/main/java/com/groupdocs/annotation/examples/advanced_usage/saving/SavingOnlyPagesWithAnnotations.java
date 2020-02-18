package com.groupdocs.annotation.examples.advanced_usage.saving;

import com.groupdocs.annotation.Annotator;
import com.groupdocs.annotation.examples.Constants;
import com.groupdocs.annotation.models.Rectangle;
import com.groupdocs.annotation.models.annotationmodels.AnnotationBase;
import com.groupdocs.annotation.models.annotationmodels.AreaAnnotation;
import com.groupdocs.annotation.models.annotationmodels.EllipseAnnotation;
import com.groupdocs.annotation.options.export.SaveOptions;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FilenameUtils;

/**
 * <p>
 * This example demonstrates saving result document with specified pages
 * </p>
 */
public class SavingOnlyPagesWithAnnotations {

    public static void run() {
        String outputPath = Constants.getOutputFilePath("SavingOnlyPagesWithAnnotations", FilenameUtils.getExtension(Constants.INPUT));

        final Annotator annotator = new Annotator(Constants.INPUT);

        AreaAnnotation area = new AreaAnnotation();
        area.setBox(new Rectangle(100, 100, 100, 100));
        area.setBackgroundColor(65535);
        area.setPageNumber(1);
        EllipseAnnotation ellipse = new EllipseAnnotation();
        ellipse.setBox(new Rectangle(100, 100, 100, 100));
        ellipse.setBackgroundColor(123456);
        ellipse.setPageNumber(2);
        List<AnnotationBase> annotations = new ArrayList<AnnotationBase>();
        annotations.add(area);
        annotations.add(ellipse);
        annotator.add(annotations);
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setOnlyAnnotatedPages(true);
        annotator.save(outputPath, saveOptions);

        annotator.dispose();

        System.out.println("\nDocument saved successfully.\nCheck output in " + outputPath);
    }
}
