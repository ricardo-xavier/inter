package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1119")
public class Somador1119 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
