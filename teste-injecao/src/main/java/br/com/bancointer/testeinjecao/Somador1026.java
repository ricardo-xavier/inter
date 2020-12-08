package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1026")
public class Somador1026 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
