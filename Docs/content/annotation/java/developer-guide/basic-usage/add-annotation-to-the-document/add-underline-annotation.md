---
id: add-underline-annotation
url: annotation/java/add-underline-annotation
title: Add underline annotation
weight: 14
description: "Learn what is an underline annotation and how to add it to a document programmatically using GroupDocs.Annotation for Java."
keywords: What is a underline annotation, how to add annotation, add underline annotation
productName: GroupDocs.Annotation for Java
hideChildren: False
---
**Underline** annotation marks text with a underline styling like shown at the picture below. 

![](annotation/java/images/add-underline-annotation.png)

There is an ability to specify the next fields for [UnderlineAnnotation](https://apireference.groupdocs.com/java/annotation/com.groupdocs.annotation.models.annotationmodels/UnderlineAnnotation) type:
*   [FontColor](https://apireference.groupdocs.com/annotation/java/com.groupdocs.annotation.models.annotationmodels/HighlightAnnotation#getFontColor()) - color of annotation text;
*   [Opacity](https://apireference.groupdocs.com/annotation/java/com.groupdocs.annotation.models.annotationmodels/AreaAnnotation#getOpacity()) - allows to set annotation opacity;
*   [Points](https://apireference.groupdocs.com/annotation/java/com.groupdocs.annotation.models.annotationmodels/HighlightAnnotation#getPoints()) - annotation positions set by array of points.
    

Follow these steps to add Underline annotation to document:

*   Instantiate [Annotator](https://apireference.groupdocs.com/java/annotation/com.groupdocs.annotation/Annotator) object with input document path or stream;
*   Instantiate [UnderlineAnnotation](https://apireference.groupdocs.com/java/annotation/com.groupdocs.annotation.models.annotationmodels/UnderlineAnnotation) object with desired properties (position, page number, etc);
*   Call [add](https://apireference.groupdocs.com/java/annotation/com.groupdocs.annotation/Annotator#add(com.groupdocs.annotation.models.annotationmodels.AnnotationBase)) method and pass [UnderlineAnnotation](https://apireference.groupdocs.com/java/annotation/com.groupdocs.annotation.models.annotationmodels/UnderlineAnnotation) object;
*   Call [save](https://apireference.groupdocs.com/java/annotation/com.groupdocs.annotation/Annotator#save(java.io.InputStream)) method with resultant document path or stream.

The following code demonstrates how to add [UnderlineAnnotation](https://apireference.groupdocs.com/java/annotation/com.groupdocs.annotation.models.annotationmodels/UnderlineAnnotation) to the document:

```java
String outputPath = Constants.getOutputFilePath("AddTextUnderlineAnnotation", FilenameUtils.getExtension(Constants.INPUT));
            final Annotator annotator = new Annotator(Constants.INPUT);
            try {
                Reply reply1 = new Reply();
                reply1.setComment("First comment");
                reply1.setRepliedOn(Calendar.getInstance().getTime());
                Reply reply2 = new Reply();
                reply2.setComment("Second comment");
                reply2.setRepliedOn(Calendar.getInstance().getTime());
                java.util.List<Reply> replies =  new ArrayList<Reply>();
                replies.add(reply1);
                replies.add(reply2);
                Point point1 = new Point(80, 730);
                Point point2 = new Point(240, 730);
                Point point3 = new Point(80, 650);
                Point point4 = new Point(240, 650);
                List<Point> points = new ArrayList<Point>();
                points.add(point1);
                points.add(point2);
                points.add(point3);
                points.add(point4);
                UnderlineAnnotation underline = new UnderlineAnnotation();
                underline.setCreatedOn(Calendar.getInstance().getTime());
                underline.setFontColor(65535);
                underline.setMessage("This is underline annotation");
                underline.setOpacity(0.7);
                underline.setPageNumber(0);
                underline.setPoints(points);
                underline.setReplies(replies);
                annotator.add(underline);
                annotator.save(outputPath);
            } finally {
                if (annotator != null) {
                    annotator.dispose();
                }
            }
```

## More resources
### Advanced Usage Topics
To learn more about document annotating features, please refer to the [advanced usage section]({{< ref "annotation/java/developer-guide/advanced-usage/_index.md" >}}).

### GitHub Examples
You may easily run the code above and see the feature in action in our GitHub examples:

*   [GroupDocs.Annotation for .NET examples, plugins, and showcase](https://github.com/groupdocs-annotation/GroupDocs.Annotation-for-.NET)
*   [GroupDocs.Annotation for Java examples, plugins, and showcase](https://github.com/groupdocs-annotation/GroupDocs.Annotation-for-Java)
*   [Document Annotation for .NET MVC UI Example](https://github.com/groupdocs-annotation/GroupDocs.Annotation-for-.NET-MVC)
*   [Document Annotation for .NET App WebForms UI Modern Example](https://github.com/groupdocs-annotation/GroupDocs.Annotation-for-.NET-WebForms)
*   [Document Annotation for Java App Dropwizard UI Modern Example](https://github.com/groupdocs-annotation/GroupDocs.Annotation-for-Java-Dropwizard)
*   [Document Annotation for Java Spring UI Example](https://github.com/groupdocs-annotation/GroupDocs.Annotation-for-Java-Spring)

### Free Online App
Along with full-featured Java library we provide simple, but powerful free Apps.  
You are welcome to annotate your PDF, DOC or DOCX, XLS or XLSX, PPT or PPTX, PNG and other documents with free to use online **[GroupDocs Annotation App](https://products.groupdocs.app/annotation)**.