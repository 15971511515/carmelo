package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String args[]) {

		try {

			Socket socket = new Socket("127.0.0.1", 1000);

			// �򱾻���1000�˿ڷ����ͻ�����

			BufferedReader sin = new BufferedReader(new InputStreamReader(
					System.in));

			// ��ϵͳ��׼�����豸����BufferedReader����

			PrintWriter os = new PrintWriter(socket.getOutputStream());
			// ��Socket����õ��������������PrintWriter����

			BufferedReader is = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));

			// ��Socket����õ�����������������Ӧ��BufferedReader����

			//String readline;

			//readline = sin.readLine(); // ��ϵͳ��׼�������һ�ַ���

			//while (!readline.equals("bye")) {

				// ���ӱ�׼���������ַ���Ϊ "bye"��ֹͣѭ��
		        // �����ʽ���ܳ� + requestId + command���� + command + params
				int requestId = 1;
				String command = "user!doSomething";
				String params = "id=1";
				int commandLenth = command.length();
				
				
				os.println("user!doSomething");

				// ����ϵͳ��׼���������ַ��������Server

				os.flush();

				// ˢ���������ʹServer�����յ����ַ���

				//System.out.println("Client:" + readline);

				// ��ϵͳ��׼����ϴ�ӡ������ַ���

				System.out.println(is.readLine());

				// ��Server����һ�ַ���������ӡ����׼�����

				//readline = sin.readLine(); // ��ϵͳ��׼�������һ�ַ���

			//} // ����ѭ��

			os.close(); // �ر�Socket�����

			is.close(); // �ر�Socket������

			socket.close(); // �ر�Socket

		} catch (Exception e) {
			System.out.println("Error" + e); // �������ӡ������Ϣ
		}

	}
}
