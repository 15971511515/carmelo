package json;

public class ResponseDto {
	
	/**
	 * ����ֵ����
	 */
	private int responeType;
	
	/**
	 * ����dto
	 */
	private Object data;
	
	public ResponseDto(){
		
	}
	
	public ResponseDto(int responseType, Object dataDto){
		this.responeType = responseType;
		this.data = dataDto;
	}

	public int getResponeType() {
		return responeType;
	}

	public void setResponeType(int responeType) {
		this.responeType = responeType;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object dataDto) {
		this.data = dataDto;
	}
	
	
	
}
