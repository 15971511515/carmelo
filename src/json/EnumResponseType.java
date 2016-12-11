package json;

public enum EnumResponseType {
	
	/**
	 * �ɹ�
	 */
	SUCCESS(1),
	/**
	 * ʧ��
	 */
	FAIL(2),
	/**
	 * ����
	 */
	PUSH(3);
	
	private int type;
	
	EnumResponseType(int type){
		this.type = type;
	}
	
	public int getType(){
		return this.type;
	}

}
