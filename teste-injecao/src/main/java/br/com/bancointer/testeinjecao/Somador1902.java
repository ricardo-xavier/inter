package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1902")
public class Somador1902 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
