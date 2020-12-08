package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador693")
public class Somador693 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
