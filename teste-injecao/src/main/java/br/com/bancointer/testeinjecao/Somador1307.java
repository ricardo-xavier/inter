package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1307")
public class Somador1307 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
