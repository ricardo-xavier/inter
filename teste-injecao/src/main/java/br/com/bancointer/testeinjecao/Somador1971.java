package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1971")
public class Somador1971 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
