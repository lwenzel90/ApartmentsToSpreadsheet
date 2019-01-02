//package parseaparment;
//
//import java.util.List;
//import com.google.gson.annotations.Expose;
//import com.google.gson.annotations.SerializedName;
//
//public class Route {
//
//    @SerializedName("hasTollRoad")
//    @Expose
//    private Boolean hasTollRoad;
//    @SerializedName("hasBridge")
//    @Expose
//    private Boolean hasBridge;
//    @SerializedName("distance")
//    @Expose
//    private Double distance;
//    @SerializedName("hasTimedRestriction")
//    @Expose
//    private Boolean hasTimedRestriction;
//    @SerializedName("hasTunnel")
//    @Expose
//    private Boolean hasTunnel;
//    @SerializedName("hasHighway")
//    @Expose
//    private Boolean hasHighway;
//    @SerializedName("computedWaypoints")
//    @Expose
//    private List<Object> computedWaypoints = null;
//    @SerializedName("routeError")
//    @Expose
//    private RouteError routeError;
//    @SerializedName("formattedTime")
//    @Expose
//    private String formattedTime;
//    @SerializedName("sessionId")
//    @Expose
//    private String sessionId;
//    @SerializedName("hasAccessRestriction")
//    @Expose
//    private Boolean hasAccessRestriction;
//    @SerializedName("realTime")
//    @Expose
//    private Integer realTime;
//    @SerializedName("hasSeasonalClosure")
//    @Expose
//    private Boolean hasSeasonalClosure;
//    @SerializedName("hasCountryCross")
//    @Expose
//    private Boolean hasCountryCross;
//    @SerializedName("fuelUsed")
//    @Expose
//    private Double fuelUsed;
//
//    @SerializedName("options")
//    @Expose
//    private Options options;
//    @SerializedName("time")
//    @Expose
//    private Integer time;
//    @SerializedName("hasUnpaved")
//    @Expose
//    private Boolean hasUnpaved;
//    @SerializedName("locationSequence")
//    @Expose
//    private List<Integer> locationSequence = null;
//    @SerializedName("hasFerry")
//    @Expose
//    private Boolean hasFerry;
//
//    public Boolean getHasTollRoad() {
//        return hasTollRoad;
//    }
//
//    public void setHasTollRoad(Boolean hasTollRoad) {
//        this.hasTollRoad = hasTollRoad;
//    }
//
//    public Boolean getHasBridge() {
//        return hasBridge;
//    }
//
//    public void setHasBridge(Boolean hasBridge) {
//        this.hasBridge = hasBridge;
//    }
//
//    public Double getDistance() {
//        return distance;
//    }
//
//    public void setDistance(Double distance) {
//        this.distance = distance;
//    }
//
//    public Boolean getHasTimedRestriction() {
//        return hasTimedRestriction;
//    }
//
//    public void setHasTimedRestriction(Boolean hasTimedRestriction) {
//        this.hasTimedRestriction = hasTimedRestriction;
//    }
//
//    public Boolean getHasTunnel() {
//        return hasTunnel;
//    }
//
//    public void setHasTunnel(Boolean hasTunnel) {
//        this.hasTunnel = hasTunnel;
//    }
//
//    public Boolean getHasHighway() {
//        return hasHighway;
//    }
//
//    public void setHasHighway(Boolean hasHighway) {
//        this.hasHighway = hasHighway;
//    }
//
//    public List<Object> getComputedWaypoints() {
//        return computedWaypoints;
//    }
//
//    public void setComputedWaypoints(List<Object> computedWaypoints) {
//        this.computedWaypoints = computedWaypoints;
//    }
//
//    public RouteError getRouteError() {
//        return routeError;
//    }
//
//    public void setRouteError(RouteError routeError) {
//        this.routeError = routeError;
//    }
//
//    public String getFormattedTime() {
//        return formattedTime;
//    }
//
//    public void setFormattedTime(String formattedTime) {
//        this.formattedTime = formattedTime;
//    }
//
//    public String getSessionId() {
//        return sessionId;
//    }
//
//    public void setSessionId(String sessionId) {
//        this.sessionId = sessionId;
//    }
//
//    public Boolean getHasAccessRestriction() {
//        return hasAccessRestriction;
//    }
//
//    public void setHasAccessRestriction(Boolean hasAccessRestriction) {
//        this.hasAccessRestriction = hasAccessRestriction;
//    }
//
//    public Integer getRealTime() {
//        return realTime;
//    }
//
//    public void setRealTime(Integer realTime) {
//        this.realTime = realTime;
//    }
//
//    public Boolean getHasSeasonalClosure() {
//        return hasSeasonalClosure;
//    }
//
//    public void setHasSeasonalClosure(Boolean hasSeasonalClosure) {
//        this.hasSeasonalClosure = hasSeasonalClosure;
//    }
//
//    public Boolean getHasCountryCross() {
//        return hasCountryCross;
//    }
//
//    public void setHasCountryCross(Boolean hasCountryCross) {
//        this.hasCountryCross = hasCountryCross;
//    }
//
//    public Double getFuelUsed() {
//        return fuelUsed;
//    }
//
//    public void setFuelUsed(Double fuelUsed) {
//        this.fuelUsed = fuelUsed;
//    }
//
//
//
//    public Options getOptions() {
//        return options;
//    }
//
//    public void setOptions(Options options) {
//        this.options = options;
//    }
//
//
//    public Integer getTime() {
//        return time;
//    }
//
//    public void setTime(Integer time) {
//        this.time = time;
//    }
//
//    public Boolean getHasUnpaved() {
//        return hasUnpaved;
//    }
//
//    public void setHasUnpaved(Boolean hasUnpaved) {
//        this.hasUnpaved = hasUnpaved;
//    }
//
//    public List<Integer> getLocationSequence() {
//        return locationSequence;
//    }
//
//    public void setLocationSequence(List<Integer> locationSequence) {
//        this.locationSequence = locationSequence;
//    }
//
//    public Boolean getHasFerry() {
//        return hasFerry;
//    }
//
//    public void setHasFerry(Boolean hasFerry) {
//        this.hasFerry = hasFerry;
//    }
//
//
//
//    public class RouteError {
//
//        @SerializedName("errorCode")
//        @Expose
//        private Integer errorCode;
//        @SerializedName("message")
//        @Expose
//        private String message;
//
//        public Integer getErrorCode() {
//            return errorCode;
//        }
//
//        public void setErrorCode(Integer errorCode) {
//            this.errorCode = errorCode;
//        }
//
//        public String getMessage() {
//            return message;
//        }
//
//        public void setMessage(String message) {
//            this.message = message;
//        }
//
//    }
//}