public class PaintJob {
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		return width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0
			? (int) Math.ceil(width * height / areaPerBucket - extraBuckets)
			: -1;
	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		return width > 0 && height > 0 && areaPerBucket > 0
			? (int) Math.ceil(width * height / areaPerBucket)
			: -1;
	}

	public static int getBucketCount(double area, double areaPerBucket) {
		return area > 0 && areaPerBucket > 0
			? (int) Math.ceil(area / areaPerBucket)
			: -1;
	}
}
